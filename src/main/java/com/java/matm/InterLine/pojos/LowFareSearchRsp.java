package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class LowFareSearchRsp {

    @XmlElementWrapper(name = "FlightDetailsList", namespace = "http://www.travelport.com/schema/air_v43_0")
    @XmlElement(name = "FlightDetails", namespace = "http://www.travelport.com/schema/air_v43_0")
    private List<FlightDetails> flightDetailsList;

    @XmlElementWrapper(name = "AirSegmentList", namespace = "http://www.travelport.com/schema/air_v43_0")
    @XmlElement(name = "AirSegment", namespace = "http://www.travelport.com/schema/air_v43_0")
    private List<AirSegment> AirSegmentList;

    @XmlElementWrapper(name = "FareInfoList", namespace = "http://www.travelport.com/schema/air_v43_0")
    @XmlElement(name = "FareInfo", namespace = "http://www.travelport.com/schema/air_v43_0")
    private List<FareInfo> fareInfoList;

    @XmlElementWrapper(name = "RouteList", namespace = "http://www.travelport.com/schema/air_v43_0")
    @XmlElement(name = "Route", namespace = "http://www.travelport.com/schema/air_v43_0")
    private List<Route> routeList;

    @XmlAttribute(name = "TraceId")
    private String traceId;

    @XmlAttribute(name = "TransactionId")
    private String transactionId;

    @XmlAttribute(name = "ResponseTime")
    private String responseTime;

    @XmlAttribute(name = "DistanceUnits")
    private String distanceUnits;

    @XmlAttribute(name = "CurrencyType")
    private String currencyType;

    // getters and setters

    public List<AirSegment> getAirSegmentList() {
        return AirSegmentList;
    }

    public void setAirSegmentList(List<AirSegment> airSegmentList) {
        AirSegmentList = airSegmentList;
    }

    public List<FlightDetails> getFlightDetailsList() {
        return flightDetailsList;
    }

    public void setFlightDetailsList(List<FlightDetails> flightDetailsList) {
        this.flightDetailsList = flightDetailsList;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getDistanceUnits() {
        return distanceUnits;
    }

    public void setDistanceUnits(String distanceUnits) {
        this.distanceUnits = distanceUnits;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}
