package com.example.week3samnple

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by nampham on 4/9/21.
 */
class MainViewModelFactory(val userName: String, val email: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(userName, email) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
