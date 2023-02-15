package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class FareSurcharge {
    @XmlAttribute(name = "Key")
    private String key;

    @XmlAttribute(name = "Type")
    private String type;

    @XmlAttribute(name = "Amount")
    private String amount;
}
