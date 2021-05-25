package me.darthwithap.authenticweather.data.model

import java.io.Serializable

data class WeatherCondition(
    val temp: Double? = null,
    val tempMin: Double? = null,
    val grndLevel: Int? = null,
    val humidity: Int? = null,
    val pressure: Int? = null,
    val seaLevel: Int? = null,
    val feelsLike: Double? = null,
    val tempMax: Double? = null
): Serializable