package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("account-transaction")
public class AccountTransaction : Transaction() {
    public var type:String = ""
}