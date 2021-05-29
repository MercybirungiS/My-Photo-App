package com.firstapp.myphotoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var image2: Button
    lateinit var backImage:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castViews()
        clickNext()
        back()
    }

    fun castViews() {
        image2 = findViewById<Button>(R.id.btnNext2)
        backImage=findViewById<Button>(R.id.btnBack1)

    }

    fun clickNext(){
        image2.setOnClickListener{
            var intent=Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
    fun back(){
        backImage.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
    }




