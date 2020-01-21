package com.example.animals.di

import com.example.animals.model.AnimalApi
import com.example.animals.model.AnimalApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by André Lopes on 21/01/2020
 */
@Module
open class ApiModule {

    private val baseURL = "https://us-central1-apis-4674e.cloudfunctions.net"

    @Provides
    fun provideAnimalApi(): AnimalApi {
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(AnimalApi::class.java)
    }

//    @Provides
//    fun provideAnimalApi(): AnimalApi {
//        return Retrofit.Builder()
//            .baseUrl(baseURL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .client(okHttpBuilder.build())
//            .build()
//            .create(AnimalApi::class.java)
//    }

    @Provides
    open fun provideAnimalApiService(): AnimalApiService {
        return AnimalApiService()
    }
}