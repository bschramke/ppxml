package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("attribute-type")
public class AttributeType {
    public var id:String = ""
    public var name:String = ""
    public var columnLabel:String = ""
    public var target:String = ""
    public var type:String = ""
    public var converterClass:String = ""
}