package com.cheezycode.quizzed.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cheezycode.quizzed.R

class Varanasi2 : AppCompatActivity() {

    lateinit var btnVar2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_varanasi2)

        btnVar2=findViewById(R.id.btnVar2)
        btnVar2.setOnClickListener {
            val intent = Intent(this, Varanasi::class.java)
            startActivity(intent)
        }

    }
}