package com.example.animals.di

import com.example.animals.viewmodel.ListViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Created by André Lopes on 21/01/2020
 */
@Singleton
@Component(modules = [ApiModule::class, PrefsModule::class, AppModule::class])
interface ViewModelComponent {
    fun inject(viewModel: ListViewModel)
}