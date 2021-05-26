package me.darthwithap.authenticweather.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class WeatherForecast(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val dt: Int? = null,
    val visibility: Int? = null,
    @SerializedName("dt_txt")
    val dtTxt: String? = null,
    @SerializedName("weather")
    val weatherDescription: List<WeatherDescription?>? = null,
    @SerializedName("main")
    val weatherCondition: WeatherCondition? = null,
    val wind: Wind? = null
)


