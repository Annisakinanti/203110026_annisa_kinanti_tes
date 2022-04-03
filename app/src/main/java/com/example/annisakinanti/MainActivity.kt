package com.example.annisakinanti

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        // set variabel yang mana nilainya dari id elemen activity_main.xml
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val userName = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        // method ini akan berjalan apabila tombol btnLogin diklik
        btnLogin.setOnClickListener {
            // menvalidasi isian elemen input username dan password
            // jika keduanya bernilai true maka akan intent ke kelas Welcome
            if (userName.text.toString() == "annisa" && password.text.toString() == "1234") {
                startActivity(Intent(this, welcome::class.java))

            // jika ada kondisi false maka akan menampilkan toast "Login Failed!"
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }

    }

}

