package com.github.bschramke.ppxml.util

import com.github.bschramke.ppxml.XStreamFactoryTest
import java.io.File
import java.io.FileNotFoundException

fun resourceFile(resourcePath: String): File {
    val resourceUrl = XStreamFactoryTest::class.java.classLoader.getResource(resourcePath)
            ?: throw FileNotFoundException("There is no resource file $resourcePath")

    return  File(resourceUrl.toURI())
}