package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("client")
public class Client {
    public var version:Int = 0
    public var baseCurrency:String = "EUR"
    public var securities:MutableList<Security> = mutableListOf()
    public var watchlists:MutableList<Watchlist> = mutableListOf()
    public var accounts:MutableList<Account> = mutableListOf()
    public var dashboards:MutableList<Dashboard> = mutableListOf()
    public val properties:MutableMap<String,String> = mutableMapOf()
    public val settings:ClientSettings = ClientSettings()
}