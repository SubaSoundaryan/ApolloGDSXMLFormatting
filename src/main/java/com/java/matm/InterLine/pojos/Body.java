package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

    @XmlElement(name = "LowFareSearchRsp", namespace = "http://www.travelport.com/schema/air_v43_0")
    private LowFareSearchRsp lowFareSearchRsp;

    // getters and setters

    public LowFareSearchRsp getLowFareSearchRsp() {
        return lowFareSearchRsp;
    }

    public void setLowFareSearchRsp(LowFareSearchRsp lowFareSearchRsp) {
        this.lowFareSearchRsp = lowFareSearchRsp;
    }
}
