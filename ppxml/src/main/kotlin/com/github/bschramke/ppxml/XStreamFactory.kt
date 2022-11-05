package com.github.bschramke.ppxml

import com.github.bschramke.ppxml.model.BuySellEntry
import com.github.bschramke.ppxml.model.Client
import com.github.bschramke.ppxml.model.SecurityProperty
import com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.security.NullPermission

public val defaultXStream:XStream by lazy { createXStream() }

public fun createXStream():XStream = XStream().apply {

    allowTypesByWildcard(arrayOf(
        "com.github.bschramke.ppxml.**"
    ))

    ignoreUnknownElements()

    processAnnotations(Client::class.java)
    processAnnotations(SecurityProperty::class.java)
    processAnnotations(BuySellEntry::class.java)
}