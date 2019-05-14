package dev.vespertine.workouttracker.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey



@Entity(tableName = "workoutroutines")
data class WorkoutRoutine(@PrimaryKey(autoGenerate = true)
                          @ColumnInfo(name = "worokoutroutine_id")
                          val workoutroutineID: Long = 0,
                          @ColumnInfo(name = "routine_name")
                          val routineName: String,
                          @ColumnInfo(name = "day_number")
                          val dayNumber: Int,
                          val tags: MutableList<String>?)
