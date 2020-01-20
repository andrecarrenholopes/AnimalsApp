package com.example.animals.model

import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by André Lopes on 17/01/2020
 */
interface AnimalApi {

    @GET("getKey")
    fun getApiKey() : Single<ApiKey>

    @FormUrlEncoded
    @POST("getAnimals")
    fun getAnimals(
        @Field("key") key: String
    ) : Single<List<Animal>>
}