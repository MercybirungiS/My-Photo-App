package com.firstapp.myphotoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var image4: Button
    lateinit var backImage3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        castViews()
        clickNext()
        back()
    }

    fun castViews() {
        image4 = findViewById<Button>(R.id.btnNext4)
        backImage3=findViewById<Button>(R.id.btnBack3)

    }

    fun clickNext() {
        image4.setOnClickListener {
            var intent = Intent(baseContext, MainActivity5::class.java)
            startActivity(intent)
        }
    }
    fun back(){
        backImage3.setOnClickListener {
            var intent=Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}




