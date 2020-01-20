package com.example.animals.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by André Lopes on 17/01/2020
 */
class AnimalApiService {

    private val baseURL = "https://us-central1-apis-4674e.cloudfunctions.net"

    private val api = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(AnimalApi::class.java)

    fun getApiKey() : Single<ApiKey> {
        return api.getApiKey()
    }

    fun getAnimals(key: String) : Single<List<Animal>> {
        return api.getAnimals(key)
    }
}