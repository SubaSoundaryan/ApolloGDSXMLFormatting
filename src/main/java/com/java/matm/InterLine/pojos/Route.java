package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Route {
    @XmlAttribute(name = "Key")
    private String key;

    @XmlElement(name = "Leg", namespace = "http://www.travelport.com/schema/air_v43_0")
    private List<Leg> legs;
}
