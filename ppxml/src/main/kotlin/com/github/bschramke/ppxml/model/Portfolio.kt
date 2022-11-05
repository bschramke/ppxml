package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("portfolio")
public class Portfolio {
    public var uuid: String? = null
    public var name: String? = null
    public var note: String? = null
    public var isRetired:Boolean = false

    public var referenceAccount:Account? = null
    public var transactions:MutableList<PortfolioTransaction> = mutableListOf()
    public var attributes: Attributes = Attributes()
}