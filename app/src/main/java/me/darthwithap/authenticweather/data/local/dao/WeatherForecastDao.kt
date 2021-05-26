package me.darthwithap.authenticweather.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.darthwithap.authenticweather.data.local.entity.WeatherForecastEntity

@Dao
interface WeatherForecastDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertForecastWeather(vararg weatherForecast: WeatherForecastEntity)

    @Query("SELECT * FROM weather_forecast_table ORDER BY id DESC")
    suspend fun getAllForecastWeather(): List<WeatherForecastEntity>

    @Query("DELETE FROM weather_forecast_table")
    suspend fun deleteAllForecastWeather()
}