package com.example.demonstrationsandroid.findview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.demonstrationsandroid.R

class FindViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_view)

        val tvDemo = findViewById<TextView>(R.id.tv_demo)
        tvDemo.text = "Ceci est un test !"

        val btnDemoclik = findViewById<Button>(R.id.btn_democlic)
        btnDemoclik.setOnClickListener {
            Toast.makeText(this, "Un super texte", Toast.LENGTH_SHORT).show()
        }
    }

    // ici 'view' designe le bouton sur lequel j'ai clique
    fun clickDemo(view: View) {
        val etDemo = findViewById<EditText>(R.id.et_democlic)
        // val chaine = etDemo.text.toString()

        Toast.makeText(this, etDemo.text.toString(), Toast.LENGTH_LONG).show()
    }
}