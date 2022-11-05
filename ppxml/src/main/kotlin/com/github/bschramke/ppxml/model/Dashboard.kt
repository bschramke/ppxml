package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamAsAttribute

@XStreamAlias("dashboard")
public class Dashboard {
    @XStreamAsAttribute
    public var name:String = ""
    public var configuration:MutableMap<String,String> = mutableMapOf()
    public var columns:MutableList<Column> = mutableListOf()

    @XStreamAlias("column")
    public class Column {
        public var weight:Int = 1
        public var widgets:MutableList<Widget> = mutableListOf()
    }

    @XStreamAlias("widget")
    public data class Widget(
        @XStreamAsAttribute
        public var type:String,
        public var label:String,
        public var configuration:MutableMap<String,String> = mutableMapOf()
    )
}