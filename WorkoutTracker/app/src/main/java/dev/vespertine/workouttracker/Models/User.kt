package dev.vespertine.workouttracker.Models

import java.util.Date

data class User(val userID: Long,
                val name: String,
                val email: String,
                val password: String,
                val registrationDate: Date)