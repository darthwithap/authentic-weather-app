package me.darthwithap.authenticweather.data.local.entity

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import me.darthwithap.authenticweather.data.model.WeatherDescription
import java.lang.reflect.Type

class ListWeatherDescriptionConverter {
    private val gson = Gson()
    private val type: Type = object : TypeToken<List<WeatherDescription?>?>() {}.type

    @TypeConverter
    fun fromWeatherDescToList(list: List<WeatherDescription?>?): String {
        return gson.toJson(list, type)
    }

    @TypeConverter
    fun toWeatherDescList(json: String?): List<WeatherDescription> {
        return gson.fromJson(json, type)
    }
}