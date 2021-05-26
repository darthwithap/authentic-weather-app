package me.darthwithap.authenticweather.data.local.entity

import androidx.room.*
import me.darthwithap.authenticweather.data.model.Coordinate
import me.darthwithap.authenticweather.data.model.WeatherCondition
import me.darthwithap.authenticweather.data.model.WeatherDescription
import me.darthwithap.authenticweather.data.model.Wind

@Entity(tableName = "weather_table")
data class WeatherEntity(

    @ColumnInfo(name = "unique_id")
    @PrimaryKey(autoGenerate = true)
    val uId: Int = 0,

    @Embedded
    val weatherCondition: WeatherCondition,

    @Embedded
    val coord: Coordinate,

    @ColumnInfo(name = "weather_details")
    val weatherDescriptions: List<WeatherDescription>,

    @ColumnInfo(name = "city_name")
    val name: String,

    @ColumnInfo(name = "city_id")
    val cityId: Int,

    @Embedded
    val wind: Wind,


)