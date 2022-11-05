package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("portfolio-transfer")
public class PortfolioTransferEntry : CrossEntry {
    public var portfolioFrom : Account? = null
    public var transactionFrom: AccountTransaction? = null
    public var portfolioTo: Account? = null
    public var transactionTo: AccountTransaction? = null
}