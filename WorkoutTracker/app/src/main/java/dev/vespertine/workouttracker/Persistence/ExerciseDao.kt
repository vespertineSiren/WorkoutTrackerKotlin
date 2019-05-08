package dev.vespertine.workouttracker.Persistence

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import dev.vespertine.workouttracker.Models.Exercise

@Dao
interface ExerciseDao: BaseDao<Exercise> {

    @Query(value = "SELECT * FROM exercises")
    fun getAllExercises(): LiveData<List<Exercise>>

    @Query(value = "SELECT * FROM exercises WHERE exercise_id = :exerciseID")
    fun getExerciseWithID(exerciseID: Long): Exercise?

}