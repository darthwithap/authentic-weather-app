package me.darthwithap.authenticweather.data.model

import java.io.Serializable

data class WeatherDescription(
    val id: Int? = null,
    val icon: String? = null,
    val description: String? = null,
    val main: String? = null
) : Serializable