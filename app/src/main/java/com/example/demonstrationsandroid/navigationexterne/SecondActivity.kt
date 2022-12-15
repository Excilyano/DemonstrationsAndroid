package com.example.demonstrationsandroid.navigationexterne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.demonstrationsandroid.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val monUser = intent.extras?.get("mon_utilisateur")

        findViewById<TextView>(R.id.tv_utilisateur).text = monUser.toString()
    }
}