package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Leg {
    @XmlAttribute(name = "Key")
    private String key;

    @XmlAttribute(name = "Group")
    private int group;

    @XmlAttribute(name = "Origin")
    private String origin;

    @XmlAttribute(name = "Destination")
    private String destination;
}
