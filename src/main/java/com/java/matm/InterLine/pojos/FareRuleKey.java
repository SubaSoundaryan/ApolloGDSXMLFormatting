package com.java.matm.InterLine.pojos;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class FareRuleKey {

    @XmlAttribute(name = "FareInfoRef")
    private String fareInfoRef;

    @XmlAttribute(name = "ProviderCode")
    private String providerCode;

    @XmlValue
    private String value;

}
