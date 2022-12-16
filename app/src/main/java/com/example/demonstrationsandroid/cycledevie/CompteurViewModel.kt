package com.example.demonstrationsandroid.cycledevie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    var cpt = MutableLiveData(0)

    fun increment() {
        cpt.value = cpt.value?.plus(1)
        // Equivalent a cpt++ mais avec livedata
    }

    fun decrementer() {
        cpt.value = cpt.value?.minus(1)
    }
}