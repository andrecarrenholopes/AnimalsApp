package com.example.animals

import com.example.animals.di.ApiModule
import com.example.animals.model.AnimalApi
import com.example.animals.model.AnimalApiService

/**
 * Created by André Lopes on 21/01/2020
 */
class ApiModuleTest(val mockService: AnimalApiService): ApiModule() {
    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}