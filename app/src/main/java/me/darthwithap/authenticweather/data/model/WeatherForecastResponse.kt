package me.darthwithap.authenticweather.data.model

import com.google.gson.annotations.SerializedName

data class WeatherForecastResponse(
    val city: City? = null,
    @SerializedName("list")
    val weathers: List<WeatherForecast?>? = null
)