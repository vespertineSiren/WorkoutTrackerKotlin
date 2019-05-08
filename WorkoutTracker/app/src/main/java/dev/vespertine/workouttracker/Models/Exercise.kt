package dev.vespertine.workouttracker.Models

import android.arch.persistence.room.*

@Entity(tableName = "exercises",
    indices = [(Index(value = ["exercise_id"], name = "idx_exercises_exercise_id"))],
    foreignKeys =
    [(ForeignKey(
        entity = WorkoutRoutine::class,
        parentColumns = ["worokoutroutine_id"],
        childColumns = ["exercise_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE))])
data class Exercise( @PrimaryKey(autoGenerate = true)
                     @ColumnInfo(name = "worokoutroutine_id")
                     val workoutroutineID: Long,
                     @ColumnInfo(name = "exercise_id")
                     val exerciseID: Long,
                     @ColumnInfo(name = "exercise_name")
                     val name: String,
                     var isMachine: Boolean,
                     var weight: Double,
                     var repRange: Int,
                     var maxReps: Boolean,
                     var failed: Boolean)

data class ExerciseMinimal(val id: String,
                           val exerciseName: String,
                           val weight: Double,
                           var failed: Boolean)