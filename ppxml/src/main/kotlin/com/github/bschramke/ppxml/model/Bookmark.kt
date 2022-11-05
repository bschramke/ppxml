package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias

@XStreamAlias("bookmark")
public data class Bookmark (
    val label: String,
    val pattern: String
)