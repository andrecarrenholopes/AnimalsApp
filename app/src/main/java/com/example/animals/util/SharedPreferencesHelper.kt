package com.example.animals.util

import android.preference.PreferenceManager
import android.content.Context

/**
 * Created by André Lopes on 20/01/2020
 */
class SharedPreferencesHelper(context: Context) {

    private val PREF_API_KEY = "Api key"

    private val pref = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)

    fun saveApiKey(key: String?) {
        pref.edit().putString(PREF_API_KEY, key).apply()
    }

    fun getKey() = pref.getString(PREF_API_KEY, null)
}