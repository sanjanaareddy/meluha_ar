package com.cheezycode.quizzed.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cheezycode.quizzed.R

class Warangalfort2 : AppCompatActivity() {

    lateinit var btnWar2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warangalfort2)

        btnWar2=findViewById(R.id.btnWar2)
        btnWar2.setOnClickListener {
            val intent = Intent(this, Warangalfort::class.java)
            startActivity(intent)
        }


    }
}