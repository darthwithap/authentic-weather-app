package me.darthwithap.authenticweather.data.remote.retrofit

import me.darthwithap.authenticweather.data.model.Weather
import me.darthwithap.authenticweather.data.model.WeatherForecastResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("weather")
    suspend fun getWeather(
        @Query("q") query: String,
        @Query("appid") apiKey: String
    ): Response<Weather>

    @GET("weather")
    suspend fun getWeatherByCityId(
        @Query("id") cityId: Int,
        @Query("appid") apiKey: String
    ): Response<Weather>

    @GET("weather")
    suspend fun getWeatherByCoordinate(
        @Query("lat") lat: Double,
        @Query("lon") long: Double,
        @Query("appid") apiKey: String
    ): Response<Weather>

    @GET("forecast")
    suspend fun getWeatherForecastByCityId(
        @Query("id") cityId: Int,
        @Query("appid") apiKey: String
    ): Response<WeatherForecastResponse>
}