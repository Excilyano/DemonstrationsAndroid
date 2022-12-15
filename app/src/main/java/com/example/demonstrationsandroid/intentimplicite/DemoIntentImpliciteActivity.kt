package com.example.demonstrationsandroid.intentimplicite

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import com.example.demonstrationsandroid.R


class DemoIntentImpliciteActivity : AppCompatActivity() {
    val requestPermissionLauncherCall = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) {isGranted : Boolean -> sendSMS(isGranted)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_intent_implicite)

        findViewById<Button>(R.id.btn_intent_implicite).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:45.0626,-0.7642686"))
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_naviguer_vers_pdf).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.type = "application/pdf"
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_envoyer_sms).setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == 0) {
                sendSMS(true)
            } else {
                requestPermissionLauncherCall.launch(Manifest.permission.SEND_SMS)
            }
        }
    }

    private fun sendSMS(granted: Boolean) {
        if (granted) {
            val manager = SmsManager.getDefault()
            manager.sendTextMessage("0123456789", null, "coucou", null, null)
        } else {
            Toast.makeText(this, "Autorise moi pauvre nouille", Toast.LENGTH_LONG).show()
        }
    }
}