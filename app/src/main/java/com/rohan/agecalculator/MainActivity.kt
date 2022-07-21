package com.rohan.agecalculator


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bugettage.setOnClickListener {
            val userdob:Int = Integer.parseInt(etDOB.text.toString())
            val currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
            val userAge:Int = currentYear - userdob
            ShowAge.text= "Your Age is $userAge Years"
        }
    }
}