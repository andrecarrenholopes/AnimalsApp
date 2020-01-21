package com.example.animals

import android.app.Application
import com.example.animals.di.PrefsModule
import com.example.animals.util.SharedPreferencesHelper

/**
 * Created by André Lopes on 21/01/2020
 */
class PrefsModuleTest(val mockPrefs: SharedPreferencesHelper): PrefsModule() {
    override fun provideSharedPreferences(app: Application): SharedPreferencesHelper {
        return mockPrefs
    }
}