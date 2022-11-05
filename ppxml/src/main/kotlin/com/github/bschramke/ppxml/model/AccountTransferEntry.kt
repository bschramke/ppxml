package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("account-transfer")
public class AccountTransferEntry : CrossEntry {
    public var accountFrom : Account? = null
    public var transactionFrom: AccountTransaction? = null
    public var accountTo: Account? = null
    public var transactionTo: AccountTransaction? = null
}