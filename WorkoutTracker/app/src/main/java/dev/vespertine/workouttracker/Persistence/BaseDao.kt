package dev.vespertine.workouttracker.Persistence

import android.arch.persistence.room.*

@Dao
interface BaseDao<in T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inset(type: T): Long

    @Delete
    fun delete(type: T)

    @Update
    fun update(type: T)
}