package com.example.mostrarmensaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var editText: EditText
    lateinit var btnmostrar: Button
    lateinit var textmostrar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        btnmostrar = findViewById(R.id.btnmostrar)
        textmostrar = findViewById(R.id.textmostrar)

        btnmostrar.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        val mostrar = editText.text
        textmostrar.text = " $mostrar"
    }
}