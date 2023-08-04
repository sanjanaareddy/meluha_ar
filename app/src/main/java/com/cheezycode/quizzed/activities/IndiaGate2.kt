package com.cheezycode.quizzed.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cheezycode.quizzed.R

class IndiaGate2 : AppCompatActivity() {

    lateinit var btnInd2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_india_gate2)

        btnInd2=findViewById(R.id.btnInd2)
        btnInd2.setOnClickListener {
            val intent = Intent(this, IndiaGate::class.java)
            startActivity(intent)
        }

    }
}