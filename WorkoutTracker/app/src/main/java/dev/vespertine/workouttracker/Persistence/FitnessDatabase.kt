package dev.vespertine.workouttracker.Persistence

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import dev.vespertine.workouttracker.Models.*

@Database(entities = [Exercise::class, User::class, WorkoutRoutine::class], version = 1)
abstract class FitnessDatabase: RoomDatabase(){

    abstract fun exerciseDao(): ExerciseDao
    abstract fun workoutRoutineDao(): WorkoutRoutineDao

    companion object{
        var INSTANCE: FitnessDatabase? = null

        fun getFitnessDatabase(context: Context): FitnessDatabase? {
            if (INSTANCE == null) {
                synchronized(FitnessDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        FitnessDatabase::class.java,
                        "myFitnessDB")
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyDatabase(){
            INSTANCE = null
        }
    }
}