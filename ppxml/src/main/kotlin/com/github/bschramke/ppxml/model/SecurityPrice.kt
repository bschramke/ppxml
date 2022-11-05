package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamAsAttribute

@XStreamAlias("price")
public class SecurityPrice {
    @XStreamAlias("t")
    @XStreamAsAttribute
    public var time:String? = null
    @XStreamAlias("v")
    @XStreamAsAttribute
    public var value:Long = 0
}