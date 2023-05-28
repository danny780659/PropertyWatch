package com.example.tutorial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<TextView>(R.id.email_edit);
        val loginButton = findViewById<Button>(R.id.login_button);

        loginButton.setOnClickListener{
            val msg = "Login pressed for " + email.text.toString()

            Toast.makeText (this, msg, Toast.LENGTH_SHORT)
                .show()

        }

    }
}