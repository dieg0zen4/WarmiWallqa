package com.warmiwallqa.warmiwallqa.activities.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.warmiwallqa.warmiwallqa.R

class Login : AppCompatActivity() {

    private lateinit var textUsuario: EditText
    private lateinit var textPassword: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


    }
}