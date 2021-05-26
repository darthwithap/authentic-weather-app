package me.darthwithap.authenticweather.data.local

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.darthwithap.authenticweather.data.local.dao.WeatherDao
import me.darthwithap.authenticweather.data.local.dao.WeatherForecastDao
import me.darthwithap.authenticweather.data.local.entity.WeatherEntity
import me.darthwithap.authenticweather.data.local.entity.WeatherForecastEntity

class WeatherData(
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val weatherDao: WeatherDao,
    private val weatherForecastDao: WeatherForecastDao
) : WeatherDataSource {
    override suspend fun getWeather(): WeatherEntity {
        return withContext(ioDispatcher) {
            return@withContext weatherDao.getWeather()
        }
    }

    override suspend fun insertWeather(weather: WeatherEntity) {
        return withContext(ioDispatcher) {
            return@withContext weatherDao.insertWeather(weather)
        }
    }

    override suspend fun deleteAllWeather() {
        return withContext(ioDispatcher) {
            return@withContext weatherDao.deleteAllWeather()
        }
    }

    override suspend fun getAllWeather(): List<WeatherEntity> {
        return withContext(ioDispatcher) {
            return@withContext weatherDao.getAllWeather()
        }
    }

    override suspend fun getAllForecastWeather(): List<WeatherForecastEntity>? {
        return withContext(ioDispatcher) {
            return@withContext weatherForecastDao.getAllForecastWeather()
        }
    }

    override suspend fun insertForecastWeather(weatherForecast: WeatherForecastEntity) {
        return withContext(ioDispatcher) {
            return@withContext weatherForecastDao.insertForecastWeather(weatherForecast)
        }
    }

    override suspend fun deleteAllForecastWeather() {
        return withContext(ioDispatcher) {
            return@withContext weatherForecastDao.deleteAllForecastWeather()
        }
    }
}