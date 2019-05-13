package dev.vespertine.workouttracker.Persistence

import androidx.room.*


@Dao
interface BaseDao<in T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inset(type: T): Long

    @Delete
    suspend fun delete(type: T)

    @Update
    suspend fun update(type: T)
}