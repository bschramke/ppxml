package com.github.bschramke.ppxml

import com.github.bschramke.ppxml.model.Bookmark
import com.github.bschramke.ppxml.model.Client
import com.github.bschramke.ppxml.model.ClientSettings
import com.github.bschramke.ppxml.model.Security
import com.github.bschramke.ppxml.model.SecurityProperty
import com.github.bschramke.ppxml.util.resourceFile
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import java.util.UUID

internal class XStreamFactoryTest {

    @Test
    fun `should create valid XStream`() {
        val xstream = createXStream()

        val result: Client = xstream.fromXML(resourceFile("version_56.xml")) as Client


        with(result) {
            assertThat(version).isEqualTo(56)
            assertThat(baseCurrency).isEqualTo("EUR")
            assertThat(securities).hasSize(11)

             with(securities.first()) {
                 assertThat(uuid).isEqualTo(UUID.fromString("f52d3250-9a9f-4fd5-b4e4-5bcf705e0a15"))
                 assertThat(name).isEqualTo("Dax")
                 assertThat(isRetired).isFalse()

                 assertThat(latest).isNotNull()
                 with(latest!!) {
                     assertThat(time).isEqualTo("2022-11-04")
                     assertThat(value).isEqualTo(1345985000000L)
                 }

                 assertThat(prices).hasSize(2530)
                 with(prices?.get(999)!!) {
                     assertThat(time).isEqualTo("2016-10-21")
                     assertThat(value).isEqualTo(1071073050000L)
                 }

                 assertThat(attributes.map).isNotEmpty()
                 assertThat(attributes.map).containsEntry("fe77e0c2-ee87-46cd-a764-f635c94ac1da", "keiner")
                 assertThat(attributes.map).containsEntry("fcb8490a-0121-4fa7-950c-a06cdd6ac4f9", "Deutscher Aktien Index")

                 assertThat(properties).isNull()
             }

            with(securities[4]){
                assertThat(properties).hasSize(4)
            }
        }

    }

    @Test
    fun `write test`() {

        val client = Client()

        val xstream = createXStream()

        val xml = xstream.toXML(client)
        assertThat(xml).isNotEmpty()
    }
}