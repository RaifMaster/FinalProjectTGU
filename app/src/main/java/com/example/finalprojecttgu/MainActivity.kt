package com.example.finalprojecttgu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonWeb:Button = findViewById(R.id.studiobtn)
        val btnActTwo:Button = findViewById(R.id.contactbtn)

        buttonWeb.setOnClickListener  {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio"))
            startActivity(intent)
        }
        btnActTwo.setOnClickListener  {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}