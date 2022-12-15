package com.example.demonstrationsandroid.cycledevie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.demonstrationsandroid.R

class DemoCycleDeVieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_cycle_de_vie)
        Log.i("ETIENNE", "Passage dans la methode onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ETIENNE", "Passage dans la methode onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ETIENNE", "Passage dans la methode onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ETIENNE", "Passage dans la methode onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ETIENNE", "Passage dans la methode onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ETIENNE", "Passage dans la methode onDestroy")
    }
}