package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("account")
public class Account {
    public var uuid: String? = null
    public var name: String? = null
    public var currencyCode: String? = null
    public var note: String? = null
    public var isRetired: Boolean = false

    public var transactions:MutableList<AccountTransaction> = mutableListOf()
}