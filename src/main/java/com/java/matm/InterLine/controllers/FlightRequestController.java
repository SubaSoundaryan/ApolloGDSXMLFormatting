package com.java.matm.InterLine.controllers;

import com.java.matm.InterLine.content.source.ApolloGDS;
import com.java.matm.InterLine.pojos.ApolloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
public class FlightRequestController {

    @Autowired
    private ApolloGDS apolloGDS;

    @GetMapping("/request")
    public ApolloResponse hello() throws InterruptedException, JAXBException {
        return apolloGDS.getLowFareAirRequest();
    }
}
