package com.warmiwallqa.warmiwallqa.activities.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.warmiwallqa.warmiwallqa.R

class Login : AppCompatActivity() {

    private lateinit var textUsuario: EditText
    private lateinit var textPassword: EditText
    private lateinit var loginButton: Button
    //siuuuuuuuuuu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

    // Inicializar vistas
        textUsuario = findViewById(R.id.textUsuario)
        textPassword = findViewById(R.id.textPassword)
        loginButton = findViewById(R.id.loginButton)

    // Configurar click listener para el botón de ingresar
        loginButton.setOnClickListener {
            val usuario = textUsuario.text.toString()
            val contraseña = textPassword.text.toString()

            // Aquí puedes agregar la lógica para manejar el inicio de sesión del usuario
            // Por ejemplo, puedes validar las credenciales y mostrar un mensaje de éxito o error
            if (usuario.isNotEmpty() && contraseña.isNotEmpty()) {
                // Aquí iría la lógica para autenticar al usuario
                // Por ejemplo, puedes llamar a un método de autenticación
                // y mostrar un mensaje de éxito o error según el resultado
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor ingresa usuario y contraseña", Toast.LENGTH_SHORT).show()
            }
        }
    }
}