package com.example.demonstrationsandroid.cycledevie

import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    var cpt = 0

    fun increment() {
        cpt++
    }
}