package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamAsAttribute

@XStreamAlias("latest")
public class LatestSecurityPrice {
    @XStreamAlias("t")
    @XStreamAsAttribute
    public var time:String? = null
    @XStreamAlias("v")
    @XStreamAsAttribute
    public var value:Long = 0
    public var high:Long = 0
    public var low:Long = 0
    public var volume:Long = 0
    public var previousClose:Long = 0
}