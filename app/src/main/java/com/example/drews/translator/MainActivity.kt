package com.example.drews.translator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.os.StrictMode
import com.google.gson.GsonBuilder


class MainActivity(var textView: EditText, var translated: TextView, var translatebtn: Button, val gson: GsonBuilder) : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        textView = findViewById(R.id.textView)
        translated = findViewById(R.id.translated)
        translatebtn = findViewById(R.id.translatebtn)



        translatebtn.setOnClickListener {  }
    }
}
