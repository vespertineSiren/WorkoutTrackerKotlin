package dev.vespertine.workouttracker.Models

import android.arch.persistence.room.*

@Entity(tableName = "exercises",
    indices = [(Index(value = ["exercise_id"], name = "idx_exercises_exercise_id"))],
    foreignKeys =
    [(ForeignKey(
        entity = Exercise::class,
        parentColumns = ["worokoutroutine_id"],
        childColumns = ["exercise_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE))])
data class Exercise( @PrimaryKey(autoGenerate = true)
                     @ColumnInfo(name = "exercise_id")
                     val workoutroutineID: Long,
                     val exerciseID: Long,
                     val name: String,
                     var isMachine: Boolean,
                     var weight: Double,
                     var sets: Int,
                     var repRange: Int,
                     var mapReps: Int,
                     var mapSets: Int,
                     var failed: Boolean)