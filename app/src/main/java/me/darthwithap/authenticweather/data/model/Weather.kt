package me.darthwithap.authenticweather.data.model

import com.google.gson.annotations.SerializedName

data class Weather(
    val uId: Int,
    @SerializedName("main")
    val weatherCondition: WeatherCondition? = null,
    val coord: Coordinate? = null,
    @SerializedName("weather")
    val weatherDescriptions: List<WeatherDescription?>? = null,
    val name: String? = null,
    @SerializedName("id")
    val cityId: Int? = null,
    val wind: Wind? = null
)

