package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamOmitField

@XStreamAlias("settings")
public class ClientSettings {
    private val bookmarks:MutableList<Bookmark>? = null
    private val attributeTypes:MutableList<AttributeType>? = null
    private val configurationSets:MutableMap<String, ConfigurationSet>? = null
}