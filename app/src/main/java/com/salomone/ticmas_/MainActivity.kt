package com.salomone.ticmas_

import MainViewModel
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var buttonCompare: Button
    private lateinit var textViewResult: TextView
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        buttonCompare = findViewById(R.id.buttonCompare)
        textViewResult = findViewById(R.id.textViewResult)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        buttonCompare.setOnClickListener(View.OnClickListener {
            viewModel.setText1(editText1.text.toString())
            viewModel.setText2(editText2.text.toString())

            val result = viewModel.compareTexts()
            textViewResult.text = result
        })
    }
}

