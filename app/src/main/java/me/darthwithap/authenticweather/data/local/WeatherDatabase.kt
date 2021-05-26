package me.darthwithap.authenticweather.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import me.darthwithap.authenticweather.data.local.dao.WeatherDao
import me.darthwithap.authenticweather.data.local.dao.WeatherForecastDao
import me.darthwithap.authenticweather.data.local.entity.ListWeatherDescriptionConverter
import me.darthwithap.authenticweather.data.local.entity.WeatherEntity
import me.darthwithap.authenticweather.data.local.entity.WeatherForecastEntity

@Database(
    entities = [WeatherForecastEntity::class, WeatherEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(ListWeatherDescriptionConverter::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract val weatherDao: WeatherDao
    abstract val weatherForecastDao: WeatherForecastDao
}