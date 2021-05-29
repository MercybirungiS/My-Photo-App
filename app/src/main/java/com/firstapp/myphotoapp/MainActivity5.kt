package com.firstapp.myphotoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {

    lateinit var backImage4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        castViews()

        back()
    }

    fun castViews() {

        backImage4=findViewById<Button>(R.id.btnBack4)

    }



    fun back(){
        backImage4.setOnClickListener {
            var intent=Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}




