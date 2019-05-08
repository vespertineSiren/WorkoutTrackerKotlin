package dev.vespertine.workouttracker.Persistence

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import dev.vespertine.workouttracker.Models.Exercise
import dev.vespertine.workouttracker.Models.WorkoutRoutine

@Dao
interface WorkoutRoutineDao : BaseDao<WorkoutRoutine>{


    @Query(value = "SELECT * FROM workoutroutines")
    fun getAllWorkoutRoutines(): LiveData<List<WorkoutRoutine>>

    @Query(value = "SELECT * FROM exercises WHERE exercise_id = :exerciseID")
    fun getExerciseWithID(exerciseID: Long): Exercise?

}