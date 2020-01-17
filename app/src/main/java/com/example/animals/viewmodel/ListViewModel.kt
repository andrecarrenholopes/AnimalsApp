package com.example.animals.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.animals.model.Animal

/**
 * Created by André Lopes on 17/01/2020
 */
class ListViewModel(application: Application) : AndroidViewModel(application) {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy { MutableLiveData<Boolean>()}
    val loading by lazy { MutableLiveData<Boolean>() }

    fun refresh() {
        getAnimals()
    }

    private fun getAnimals() {
        val a1 = Animal("Jacaré")
        val a2 = Animal("Cão")
        val a3 = Animal("Gato")
        val a4 = Animal("Passaro")
        val a5 = Animal("dasdasd")
        val a6 = Animal("fsfsdfsd")

        val animalList = arrayListOf(a1, a2, a3, a4, a5, a6)

        animals.value = animalList
        loadError.value = false
        loading.value = false
    }

}