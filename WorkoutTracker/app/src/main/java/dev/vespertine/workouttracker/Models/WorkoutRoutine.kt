package dev.vespertine.workouttracker.Models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "workoutroutines")
data class WorkoutRoutine(@PrimaryKey(autoGenerate = true)
                          @ColumnInfo(name = "worokoutroutine_id")
                          val workoutroutineID: Long,
                          @ColumnInfo(name = "routine_name")
                          val routineName: String,
                          @ColumnInfo(name = "day_number")
                          val dayNumber: Int,
                          val tags: String)
