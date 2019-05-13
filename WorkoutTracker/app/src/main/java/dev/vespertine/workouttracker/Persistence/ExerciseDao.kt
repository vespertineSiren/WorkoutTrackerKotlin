package dev.vespertine.workouttracker.Persistence

import androidx.lifecycle.LiveData
import androidx.room.*
import dev.vespertine.workouttracker.Models.Exercise

@Dao
interface ExerciseDao: BaseDao<Exercise> {

    @Query(value = "SELECT * FROM exercises")
    suspend fun getAllExercises(): LiveData<List<Exercise>>

    @Query(value = "SELECT * FROM exercises WHERE exercise_id = :exerciseID")
    suspend fun getExerciseWithID(exerciseID: Long): Exercise?

}