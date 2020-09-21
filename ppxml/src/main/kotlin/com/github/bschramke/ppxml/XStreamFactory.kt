package com.github.bschramke.ppxml

import com.thoughtworks.xstream.XStream

val defaultXStream by lazy { createXStream() }

fun createXStream():XStream = XStream().apply {
}