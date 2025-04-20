package com.example.rotalivre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nameField: EditText = findViewById(R.id.etName)
        val emailField: EditText = findViewById(R.id.etEmail)
        val passwordField: EditText = findViewById(R.id.etPassword)
        val registerButton: Button = findViewById(R.id.btnRegister)

        registerButton.setOnClickListener {
            val name = nameField.text.toString()
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            // TODO: Add real user registration logic (e.g., Firebase, DB, etc.)

            // Redirecionar para a MainActivity após registro
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finaliza a tela de registro para o usuário não voltar
        }
    }
}
