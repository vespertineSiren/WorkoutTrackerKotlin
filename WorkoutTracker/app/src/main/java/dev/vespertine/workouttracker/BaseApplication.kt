package dev.vespertine.workouttracker

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.vespertine.workouttracker.di.DaggerAppComponent


class BaseApplication : DaggerApplication() {


    override fun applicationInjector() =
        DaggerAppComponent.builder().application(this).build()

}