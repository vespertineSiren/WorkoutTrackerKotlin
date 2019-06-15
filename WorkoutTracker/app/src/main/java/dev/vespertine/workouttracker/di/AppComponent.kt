package dev.vespertine.workouttracker.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dev.vespertine.workouttracker.BaseApplication


@Component (
    modules = [AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class])

interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application) : Builder
        fun build(): AppComponent
    }



}