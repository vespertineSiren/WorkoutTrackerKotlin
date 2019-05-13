package dev.vespertine.workouttracker.Utils

import androidx.room.*
import java.util.*

class DataTypeConverter {
    @TypeConverter
    fun fromTimeStamp(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun dateToTimeStamp(date: Date?): Long? {
        return date?.time
    }
}