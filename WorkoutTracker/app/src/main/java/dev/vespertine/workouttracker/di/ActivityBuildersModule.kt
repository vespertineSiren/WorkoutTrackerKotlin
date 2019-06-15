package dev.vespertine.workouttracker.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.vespertine.workouttracker.UI.AuthActivity

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity() : AuthActivity
}