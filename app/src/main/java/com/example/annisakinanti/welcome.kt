package com.example.annisakinanti

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // menampilkan view dari activity_welcome
        setContentView(R.layout.activity_welcome)

        // set variabel yang mana nilainya dari id elemen activity_welcome.xml
        val ig = findViewById<Button>(R.id.ig)
        val email = findViewById<Button>(R.id.email)

        // jika tombol Ig diklik maka akan intent membuka link instagram
        ig.setOnClickListener {
            val url = Uri.parse("https://www.instagram.com/kinanti_ak15/") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)

        }

        // jika tombol email diklik maka akan intent membuka link kirim email
        email.setOnClickListener {
            val url = Uri.parse("mailto: kinantiak833@gmail.com") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}