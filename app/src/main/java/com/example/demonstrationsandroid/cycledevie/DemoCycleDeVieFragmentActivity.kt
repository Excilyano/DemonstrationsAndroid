package com.example.demonstrationsandroid.cycledevie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.ActivityDemoCycleDeVieFragmentBinding

class DemoCycleDeVieFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityDemoCycleDeVieFragmentBinding>(
            this,
            R.layout.activity_demo_cycle_de_vie_fragment)
    }
}