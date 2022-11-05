package com.github.bschramke.ppxml

import com.github.bschramke.ppxml.util.resourceFile
import org.junit.jupiter.api.Test

internal class XStreamFactoryTest {

    @Test
    fun `should create valid XStream`() {
        val xstream = createXStream()

//        xstream.fromXML(resourceFile("ohnenamen.xml"))
    }
}