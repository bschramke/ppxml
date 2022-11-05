package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamAsAttribute
import com.thoughtworks.xstream.annotations.XStreamConverter
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter

@XStreamAlias("property")
@XStreamConverter(value = ToAttributedValueConverter::class, strings = ["value"])
public data class SecurityProperty(
    @XStreamAsAttribute
    public var type:String = "",
    @XStreamAsAttribute
    public var name:String = "",
    public var value:String = ""
)