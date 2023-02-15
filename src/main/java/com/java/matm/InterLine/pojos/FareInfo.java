package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class FareInfo {
    @XmlAttribute(name = "Key")
    private String key;

    @XmlAttribute(name = "FareBasis")
    private String fareBasis;

    @XmlAttribute(name = "PassengerTypeCode")
    private String passengerTypeCode;

    @XmlAttribute(name = "Origin")
    private String origin;

    @XmlAttribute(name = "Destination")
    private String destination;

    @XmlAttribute(name = "EffectiveDate")
    private Date effectiveDate;

    @XmlAttribute(name = "DepartureDate")
    private Date departureDate;

    @XmlAttribute(name = "Amount")
    private String amount;

    @XmlAttribute(name = "NegotiatedFare")
    private boolean negotiatedFare;

    @XmlAttribute(name = "NotValidBefore")
    private Date notValidBefore;

    @XmlAttribute(name = "NotValidAfter")
    private Date notValidAfter;

    @XmlElement(name = "FareSurcharge", namespace = "http://www.travelport.com/schema/air_v43_0")
    private FareSurcharge fareSurcharge;

    @XmlElement(name = "BaggageAllowance", namespace = "http://www.travelport.com/schema/air_v43_0")
    private BaggageAllowance baggageAllowance;

    @XmlElement(name = "FareRuleKey", namespace = "http://www.travelport.com/schema/air_v43_0")
    private FareRuleKey fareRuleKey;

    @XmlElement(name = "FareAttributes", namespace = "http://www.travelport.com/schema/air_v43_0")
    private String fareAttributes;

}
