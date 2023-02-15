package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class FlightDetails {
    @XmlAttribute(name = "Key")
    private String key;

    @XmlAttribute(name = "Origin")
    private String origin;

    @XmlAttribute(name = "Destination")
    private String destination;

    @XmlAttribute(name = "DepartureTime")
    private Date departureTime;

    @XmlAttribute(name = "ArrivalTime")
    private Date arrivalTime;

    @XmlAttribute(name = "FlightTime")
    private String flightTime;

    @XmlAttribute(name = "TravelTime")
    private String travelTime;

    @XmlAttribute(name = "Equipment")
    private String equipment;

    @XmlAttribute(name = "OriginTerminal")
    private String originTerminal;

}
