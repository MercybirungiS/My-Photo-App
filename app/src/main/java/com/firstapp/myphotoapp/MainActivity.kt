package com.firstapp.myphotoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var image1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        clickNext()

    }
    fun castViews(){
        image1=findViewById<Button>(R.id.btnone)
    }
    fun clickNext(){
        image1.setOnClickListener{
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}