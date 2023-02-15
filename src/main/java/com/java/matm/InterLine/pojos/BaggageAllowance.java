package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BaggageAllowance {

    @XmlElement(name = "MaxWeight", namespace = "http://www.travelport.com/schema/air_v43_0")
    private MaxWeight maxWeight;
}
