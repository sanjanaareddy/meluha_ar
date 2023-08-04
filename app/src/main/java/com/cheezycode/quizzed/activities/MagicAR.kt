package com.cheezycode.quizzed.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cheezycode.quizzed.R

class MagicAR : AppCompatActivity() {
    lateinit var btnVaranasi: Button
    lateinit var btnWarangalfort: Button
    lateinit var btnCharminar: Button
    lateinit var btnIndiaGate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magic_ar2)
        btnWarangalfort=findViewById(R.id.btnwarangalfort)
        btnWarangalfort.setOnClickListener {
            val intent = Intent(this, Warangalfort2::class.java)
            startActivity(intent)
        }

        btnCharminar=findViewById(R.id.btncharminar)
        btnCharminar.setOnClickListener {
            val intent = Intent(this, Charminar2::class.java)
            startActivity(intent)
        }

        btnVaranasi=findViewById(R.id.btnvaranasi)
        btnVaranasi.setOnClickListener {
            val intent = Intent(this, Varanasi2::class.java)
            startActivity(intent)
        }

        btnIndiaGate=findViewById(R.id.btnindiagate)
        btnIndiaGate.setOnClickListener {
            val intent = Intent(this, IndiaGate2::class.java)
            startActivity(intent)
        }
    }


    }

