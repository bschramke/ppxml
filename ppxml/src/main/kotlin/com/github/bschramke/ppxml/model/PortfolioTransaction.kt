package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("portfolio-transaction")
public class PortfolioTransaction : Transaction() {
    public var type:String = ""
}