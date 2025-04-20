package com.example.rotalivre

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PasswordRecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery)

        val emailField: EditText = findViewById(R.id.etRecoveryEmail)
        val sendButton: Button = findViewById(R.id.btnSendRecovery)

        sendButton.setOnClickListener {
            val email = emailField.text.toString().trim()
            if (email.isEmpty()) {
                Toast.makeText(this, "Informe seu email.", Toast.LENGTH_SHORT).show()
            } else {
                // Aqui você pode integrar com Firebase/Auth/etc
                Toast.makeText(this, "Instruções enviadas para: $email", Toast.LENGTH_LONG).show()
                finish() // Fecha a tela após envio
            }
        }
    }
}
