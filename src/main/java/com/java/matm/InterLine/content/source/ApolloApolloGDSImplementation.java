package com.java.matm.InterLine.content.source;

import com.java.matm.InterLine.pojos.ApolloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.Date;

@Service
public class ApolloApolloGDSImplementation implements ApolloGDS {

    private String xmlRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:arr=\"http://schemas.microsoft.com/2003/10/Serialization/Arrays\">\n" +
            "\n" +
            "<s:Header>\n" +
            "\n" +
            "<Action xmlns=\"http://schemas.microsoft.com/ws/2005/05/addressing/none\" s:mustUnderstand=\"1\">http://localhost:8080/kestrel/AirService</Action>\n" +
            "\n" +
            "</s:Header>\n" +
            "\n" +
            "<s:Body xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "\n" +
            "<LowFareSearchReq xmlns=\"http://www.travelport.com/schema/air_v43_0\" TraceId=\"1675324205431851419\" TargetBranch=\"P7164053\" ReturnUpsellFare=\"false\" >\n" +
            "\n" +
            "<BillingPointOfSaleInfo xmlns=\"http://www.travelport.com/schema/common_v43_0\" OriginApplication=\"uAPI\" />\n" +
            "\n" +
            "<SearchAirLeg>\n" +
            "\n" +
            "<SearchOrigin>\n" +
            "\n" +
            "<Airport xmlns=\"http://www.travelport.com/schema/common_v43_0\" Code=\"MAA\" />\n" +
            "\n" +
            "</SearchOrigin>\n" +
            "\n" +
            "<SearchDestination>\n" +
            "\n" +
            "<CityOrAirport xmlns=\"http://www.travelport.com/schema/common_v43_0\" Code=\"DXB\" />\n" +
            "\n" +
            "</SearchDestination>\n" +
            "\n" +
            "<SearchDepTime PreferredTime=\"2023-03-09\"></SearchDepTime>\n" +
            "\n" +
            "<AirLegModifiers AllowDirectAccess=\"true\">\n" +
            "\n" +
            "<PermittedCabins>\n" +
            "\n" +
            "\n" +
            "\n" +
            "<CabinClass xmlns=\"http://www.travelport.com/schema/common_v43_0\" Type=\"Business\" />\n" +
            "<CabinClass xmlns=\"http://www.travelport.com/schema/common_v43_0\" Type=\"Economy\" />\n" +
            "\n" +
            "\n" +
            "</PermittedCabins>\n" +
            "\n" +
            "</AirLegModifiers>\n" +
            "\n" +
            "</SearchAirLeg>\n" +
            "\n" +
            "<SearchAirLeg>\n" +
            "\n" +
            "<SearchOrigin>\n" +
            "\n" +
            "<CityOrAirport xmlns=\"http://www.travelport.com/schema/common_v43_0\" Code=\"DXB\" />\n" +
            "\n" +
            "</SearchOrigin>\n" +
            "\n" +
            "<SearchDestination>\n" +
            "\n" +
            "<Airport xmlns=\"http://www.travelport.com/schema/common_v43_0\" Code=\"MAA\" />\n" +
            "\n" +
            "</SearchDestination>\n" +
            "\n" +
            "<SearchDepTime PreferredTime=\"2023-03-13\"></SearchDepTime>\n" +
            "\n" +
            "<AirLegModifiers AllowDirectAccess=\"true\">\n" +
            "\n" +
            "<PermittedCabins>\n" +
            "\n" +
            "<CabinClass xmlns=\"http://www.travelport.com/schema/common_v43_0\" Type=\"Economy\" />\n" +
            "\n" +
            "</PermittedCabins>\n" +
            "\n" +
            "</AirLegModifiers>\n" +
            "\n" +
            "</SearchAirLeg>\n" +
            "\n" +
            "<AirSearchModifiers>\n" +
            "\n" +
            "<PreferredProviders>\n" +
            "\n" +
            "<Provider xmlns=\"http://www.travelport.com/schema/common_v43_0\" Code=\"1V\" />\n" +
            "\n" +
            "</PreferredProviders>\n" +
            "\n" +
            "<FlightType RequireSingleCarrier=\"false\" TripleInterlineCon=\"true\" DoubleInterlineCon=\"true\" SingleInterlineCon=\"true\" TripleOnlineCon=\"true\" DoubleOnlineCon=\"true\" SingleOnlineCon=\"true\" StopDirects=\"true\" NonStopDirects=\"true\" MaxConnections=\"3\" MaxStops=\"3\"/>\n" +
            "\n" +
            "</AirSearchModifiers>\n" +
            "\n" +
            "<SearchPassenger xmlns=\"http://www.travelport.com/schema/common_v43_0\" Code=\"ADT\"></SearchPassenger>\n" +
            "\n" +
            "<AirPricingModifiers FaresIndicator=\"PublicFaresOnly\" ReturnFareAttributes=\"true\" CurrencyType=\"CAD\" ></AirPricingModifiers>\n" +
            "\n" +
            "</LowFareSearchReq>\n" +
            "\n" +
            "</s:Body>\n" +
            "\n" +
            "</s:Envelope>";

    private final String URL = "https://apac.universal-api.pp.travelport.com/B2BGateway/connect/uAPI/AirService";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ApolloResponse getLowFareAirRequest() throws JAXBException {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);
        headers.setBasicAuth("Universal API/uAPI8341418135-c8c52f1f","Gm4?_Xq93d");

        HttpEntity<String> requestEntity = new HttpEntity<>(xmlRequest, headers);

        Long in =  new Date().getTime();
        ResponseEntity<String> response = restTemplate.postForEntity(URL, requestEntity, String.class);
        System.out.println("Time out: " + (new Date().getTime() - in));

        String result = null;
        if (response.getStatusCode().equals(HttpStatus.OK)) {
            result = (response.getBody());
            // do something with the XML response
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(ApolloResponse.class);

// Step 3: unmarshal XML into Java object
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(result);
        ApolloResponse apolloResponse = (ApolloResponse) unmarshaller.unmarshal(reader);

        return apolloResponse;
    }

}
