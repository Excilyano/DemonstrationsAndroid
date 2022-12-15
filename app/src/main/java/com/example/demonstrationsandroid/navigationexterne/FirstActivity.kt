package com.example.demonstrationsandroid.navigationexterne

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.ActivityFirstBinding
import com.example.demonstrationsandroid.findview.Utilisateur

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =
            DataBindingUtil.setContentView<ActivityFirstBinding>(this, R.layout.activity_first)

        binding.btnNaviguerIntent.setOnClickListener {
            val user = Utilisateur(1, "Kenobi", "Obiwan")

            val monIntent = Intent(this, SecondActivity::class.java)
            monIntent.putExtra("mon_utilisateur", user)
            startActivity(monIntent)
        }
    }
}