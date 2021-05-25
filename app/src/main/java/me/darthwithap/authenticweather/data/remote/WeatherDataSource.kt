package me.darthwithap.authenticweather.data.remote

import me.darthwithap.authenticweather.data.model.Coordinate
import me.darthwithap.authenticweather.data.model.Weather
import me.darthwithap.authenticweather.data.model.WeatherForecast
import me.darthwithap.authenticweather.utils.Result

interface WeatherDataSource {
    suspend fun getWeather(query: String): Result<Weather>
    suspend fun getWeatherByCityId(cityId: Int): Result<Weather>
    suspend fun getWeatherByCoordinate(coord: Coordinate): Result<Weather>
    suspend fun getWeatherForecastByCityId(cityId: Int): Result<List<WeatherForecast?>>
}