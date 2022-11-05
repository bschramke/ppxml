package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamImplicit
import java.util.UUID

@XStreamAlias("security")
public class Security {
    public var uuid:UUID? = null
    public var name:String = ""
    public var currencyCode:String = ""
    public var isin:String = ""
    public var wkn:String = ""
    public var note:String = ""
    public var tickerSymbol:String = ""
    public var feed:String = ""
    public var isRetired:Boolean = false

    public var attributes:Attributes = Attributes()

    public var latest:LatestSecurityPrice? = null

    public var prices:MutableList<SecurityPrice>? = mutableListOf()
    public var events:MutableList<SecurityEvent>? = mutableListOf()

    @XStreamImplicit
    public var properties:MutableList<SecurityProperty>? = mutableListOf()
}