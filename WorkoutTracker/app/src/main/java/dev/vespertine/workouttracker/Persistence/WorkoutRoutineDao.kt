package dev.vespertine.workouttracker.Persistence

import androidx.lifecycle.LiveData
import androidx.room.*
import dev.vespertine.workouttracker.Models.Exercise
import dev.vespertine.workouttracker.Models.WorkoutRoutine

@Dao
interface WorkoutRoutineDao : BaseDao<WorkoutRoutine>{


    @Query(value = "SELECT * FROM workoutroutines")
    suspend fun getAllWorkoutRoutines(): LiveData<List<WorkoutRoutine>>

    @Query(value = "SELECT * FROM exercises WHERE exercise_id = :exerciseID")
    suspend fun getExerciseWithID(exerciseID: Long): Exercise?

}