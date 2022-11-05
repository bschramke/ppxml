package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("buysell")
public class BuySellEntry : CrossEntry {
    public var portfolio : Portfolio? = null
    public var portfolioTransaction: PortfolioTransaction? = null
    public var account: Account? = null
    public var accountTransaction: AccountTransaction? = null
}