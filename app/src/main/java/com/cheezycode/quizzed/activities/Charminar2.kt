package com.cheezycode.quizzed.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cheezycode.quizzed.R

class Charminar2 : AppCompatActivity() {

    lateinit var btnChar2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charminar2)

        btnChar2=findViewById(R.id.btnChar2)
        btnChar2.setOnClickListener {
            val intent = Intent(this, Charminar::class.java)
            startActivity(intent)
        }

    }
}