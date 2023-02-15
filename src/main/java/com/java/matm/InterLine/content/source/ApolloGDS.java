package com.java.matm.InterLine.content.source;

import com.java.matm.InterLine.pojos.ApolloResponse;

import javax.xml.bind.JAXBException;

public interface ApolloGDS {
    ApolloResponse getLowFareAirRequest() throws InterruptedException, JAXBException;
}
