package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("watchlist")
public class Watchlist {
    public var name:String = ""
    public var securities:MutableList<Security> = mutableListOf()
}