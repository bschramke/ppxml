package com.github.bschramke.ppxml.model

import com.thoughtworks.xstream.annotations.XStreamAlias
import java.util.UUID

@XStreamAlias("config-set")
public class ConfigurationSet {
    public var configurations:MutableList<Configuration>? = null

    @XStreamAlias("config")
    public data class Configuration(
        public var uuid: UUID,
        public var name: String,
        public var data: String
    )
}