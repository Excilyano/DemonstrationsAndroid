package com.example.demonstrationsandroid.findview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityDataBindingBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_data_binding)
        binding.myUser = Utilisateur(1, "CASSIN", "Etienne")

    }
}