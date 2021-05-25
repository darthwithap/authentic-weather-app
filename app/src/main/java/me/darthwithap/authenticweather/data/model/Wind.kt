package me.darthwithap.authenticweather.data.model

import java.io.Serializable

data class Wind(
    val deg: Int? = null,
    val speed: Double? = null
) : Serializable

