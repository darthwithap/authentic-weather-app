package me.darthwithap.authenticweather.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.darthwithap.authenticweather.data.local.entity.WeatherEntity
import me.darthwithap.authenticweather.data.model.Weather

@Dao
interface WeatherDao {
    @Query("SELECT * FROM weather_table order by unique_id DESC LIMIT 1")
    suspend fun getWeather(): WeatherEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(vararg weathers: WeatherEntity)

    @Query("SELECT * FROM weather_table ORDER BY unique_id DESC")
    suspend fun getAllWeather(): List<WeatherEntity>

    @Query("DELETE FROM weather_table")
    suspend fun deleteAllWeather()
}