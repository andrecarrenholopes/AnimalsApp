package com.example.animals.di

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Created by André Lopes on 21/01/2020
 */
@Module
class AppModule(val app: Application) {
    @Provides
    fun providesApp(): Application = app
}