package com.example.animals.di

import com.example.animals.model.AnimalApiService
import dagger.Component

/**
 * Created by André Lopes on 21/01/2020
 */
@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: AnimalApiService)
}