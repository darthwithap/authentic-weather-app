package me.darthwithap.authenticweather.data.remote

import android.content.Context
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.darthwithap.authenticweather.R
import me.darthwithap.authenticweather.data.model.Coordinate
import me.darthwithap.authenticweather.data.model.Weather
import me.darthwithap.authenticweather.data.model.WeatherForecast
import me.darthwithap.authenticweather.data.remote.retrofit.Client
import me.darthwithap.authenticweather.data.remote.retrofit.Service
import me.darthwithap.authenticweather.utils.Result
import java.lang.Exception

class WeatherData(
    context: Context,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val retrofit: Service = Client.service
) : WeatherDataSource {
    private val apiKey = context.getString(R.string.api_key)
    override suspend fun getWeather(query: String): Result<Weather> {
        return withContext(ioDispatcher) {
            return@withContext try {
                val result = retrofit.getWeather(query, apiKey)
                if (result.isSuccessful) {
                    val weather = result.body()
                    Result.Success(weather)
                } else Result.Success(null)
            } catch (e: Exception) {
                Result.Error(e)
            }
        }
    }

    override suspend fun getWeatherByCityId(cityId: Int): Result<Weather> {
        return withContext(ioDispatcher) {
            return@withContext try {
                val result = retrofit.getWeatherByCityId(cityId, apiKey)
                if (result.isSuccessful) {
                    val weather = result.body()
                    Result.Success(weather)
                } else Result.Success(null)
            } catch (e: Exception) {
                Result.Error(e)
            }
        }
    }

    override suspend fun getWeatherByCoordinate(coord: Coordinate): Result<Weather> {
        return withContext(ioDispatcher) {
            return@withContext try {
                val result = retrofit.getWeatherByCoordinate(coord.lat!!, coord.lon!!, apiKey)
                if (result.isSuccessful) {
                    val weather = result.body()
                    Result.Success(weather)
                } else Result.Success(null)
            } catch (e: Exception) {
                Result.Error(e)
            }
        }
    }

    override suspend fun getWeatherForecastByCityId(cityId: Int): Result<List<WeatherForecast?>> {
        return withContext(ioDispatcher) {
            return@withContext try {
                val result = retrofit.getWeatherForecastByCityId(cityId, apiKey)
                if (result.isSuccessful) {
                    val weathers = result.body()?.weathers
                    Result.Success(weathers)
                } else Result.Success(null)
            } catch (e: Exception) {
                Result.Error(e)
            }
        }
    }
}