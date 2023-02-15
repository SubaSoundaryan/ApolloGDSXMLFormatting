package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class MaxWeight {
    @XmlAttribute(name = "Value")
    private String value;

    @XmlAttribute(name = "Unit")
    private String unit;
}
