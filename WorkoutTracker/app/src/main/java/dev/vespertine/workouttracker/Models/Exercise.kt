package dev.vespertine.workouttracker.Models


import java.util.*
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey




@Entity(tableName = "exercises",
/*
    Hold off on placing this in there.
    indices = [(Index(value = ["exercise_id"], name = "idx_exercises_exercise_id"))],
*/
    foreignKeys =
    arrayOf(
        ForeignKey(
        entity = WorkoutRoutine::class,
        parentColumns = ["worokoutroutine_id"],
        childColumns = ["exercise_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE)
    )
)
data class Exercise( @PrimaryKey(autoGenerate = true)
                     @ColumnInfo(name = "exercise_id")
                     val exerciseID: Long = 0,
                     @ColumnInfo(name = "worokoutroutine_id")
                     val workoutroutineID: Long,
                     @ColumnInfo(name = "exercise_name")
                     val name: String,
                     val history: MutableList<ExerciseHistory> = mutableListOf(),
                     val weight: Double,
                     var isMachine: Boolean,
                     var repRange: Int,
                     var maxReps: Boolean,
                     var failed: Boolean)

@Entity(tableName = "exercise_history")
data class ExerciseHistory(val id: String,
                           val exerciseName: String,
                           val historyWeight: Double,
                           val dateCompleted: Date,
                           var failed: Boolean)











