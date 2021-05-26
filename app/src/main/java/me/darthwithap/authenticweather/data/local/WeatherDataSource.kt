package me.darthwithap.authenticweather.data.local

import me.darthwithap.authenticweather.data.local.entity.WeatherEntity
import me.darthwithap.authenticweather.data.local.entity.WeatherForecastEntity
import me.darthwithap.authenticweather.data.model.Weather
import me.darthwithap.authenticweather.data.model.WeatherForecast
import me.darthwithap.authenticweather.utils.Result

interface WeatherDataSource {
    suspend fun getWeather(): WeatherEntity
    suspend fun insertWeather(weather: WeatherEntity)
    suspend fun deleteAllWeather()
    suspend fun getAllWeather(): List<WeatherEntity>
    suspend fun getAllForecastWeather(): List<WeatherForecastEntity>?
    suspend fun insertForecastWeather(weatherForecast: WeatherForecastEntity)
    suspend fun deleteAllForecastWeather()
}