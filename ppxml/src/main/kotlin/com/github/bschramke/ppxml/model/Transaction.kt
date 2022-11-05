package com.github.bschramke.ppxml.model

import java.util.UUID

public abstract class Transaction {
    public var uuid:UUID? = null
    public var crossEntry: CrossEntry? = null
}