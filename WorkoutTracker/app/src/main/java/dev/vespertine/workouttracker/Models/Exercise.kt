package dev.vespertine.workouttracker.Models

data class Exercise(val name: String,
                    var isMachine: Boolean,
                    var weight: Double,
                    var sets: Int,
                    var repRange: Int,
                    var mapReps: Int,
                    var mapSets: Int,
                    var failed: Boolean)