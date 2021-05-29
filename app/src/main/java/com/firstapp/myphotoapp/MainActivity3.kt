package com.firstapp.myphotoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var image3: Button
    lateinit var backImage2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        castViews()
        clickNext()
        back()
    }

    fun castViews() {
        image3 = findViewById<Button>(R.id.btnNext3)
        backImage2=findViewById<Button>(R.id.btnBack2)

    }

    fun clickNext() {
        image3.setOnClickListener {
            var intent = Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)
        }
    }
    fun back(){
        backImage2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}




