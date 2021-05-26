package me.darthwithap.authenticweather.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import me.darthwithap.authenticweather.data.model.WeatherDescription

@Entity(tableName = "weather_forecast_table")
data class WeatherForecastEntity(

    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "date_time")
    val dt: Int,

    val visibility: Int,

    @ColumnInfo(name = "date_time_text")
    val dtTxt: String,

    @ColumnInfo(name = "weather_details")
    val weatherDescription: List<WeatherDescription>
)