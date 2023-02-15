package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AirSegment {

    @XmlAttribute(name = "Key")
    private String key;

    @XmlAttribute(name = "Group")
    private String group;

    @XmlAttribute(name = "Carrier")
    private String carrier;

    @XmlAttribute(name = "FlightNumber")
    private String flightNumber;

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

    @XmlAttribute(name = "Distance")
    private int distance;

    @XmlAttribute(name = "ETicketability")
    private String eTicketability;

    @XmlAttribute(name = "Equipment")
    private String equipment;

    @XmlAttribute(name = "ChangeOfPlane")
    private boolean changeOfPlane;

    @XmlAttribute(name = "ParticipantLevel")
    private String participantLevel;

    @XmlAttribute(name = "LinkAvailability")
    private boolean linkAvailability;

    @XmlAttribute(name = "PolledAvailabilityOption")
    private String polledAvailabilityOption;

    @XmlAttribute(name = "OptionalServicesIndicator")
    private boolean optionalServicesIndicator;

    @XmlAttribute(name = "AvailabilitySource")
    private String availabilitySource;

    @XmlAttribute(name = "AvailabilityDisplayType")
    private String availabilityDisplayType;

}


