package com.ST10443016.imad_calculator_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisplay : TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisplay = findViewById(R.id.tvDisplay)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener { add() }
        val btnSub = findViewById<Button>(R.id.btnSubtract)
        btnSub.setOnClickListener { sub() }
        val btnMul = findViewById<Button>(R.id.btnMultiply)
        btnMul.setOnClickListener { mul() }
        val btnDiv = findViewById<Button>(R.id.btnDivide)
        btnDiv.setOnClickListener { div() }
        val btnSqr = findViewById<Button>(R.id.btnSquareRoot)
        btnSqr.setOnClickListener { sqr() }
        val btnPow = findViewById<Button>(R.id.btnPowerOf)
        btnPow.setOnClickListener { pow() }
        val btnNextSC = findViewById<Button>(R.id.btnNextScreen)
        btnNextSC.setOnClickListener {
        val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    @SuppressLint("SuspiciousIndentation")
    private fun add(){
        val strNum1 = etNum1?.text.toString()
        val strNum2 = etNum1?.text.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number"
                return
            }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 1

        intAnswer = intNum1 + intNum2
        tvDisplay?.text = intAnswer.toString()
    }
    private fun sub(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum1?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2
        tvDisplay?.text = intAnswer.toString()
    }
    private fun mul(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum1?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 1

        intAnswer = intNum1 * intNum2
        tvDisplay?.text = intAnswer.toString()
    }
    private fun div(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisplay?.text = "Please enter a valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var fltAnswer = 1

        if (intNum2 == 0){
            tvDisplay?.text = "Division by zero is not allowed"
        } else {
            fltAnswer = intNum1 / intNum2
        }
        tvDisplay?.text = fltAnswer.toString()
    }
    private fun sqr(){
        val strNum1 = etNum1?.text?.toString()
        //val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() /*|| strNum2.isNullOrEmpty()*/) {
            tvDisplay?.text = "Please enter a valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        //val intNum2 = strNum2.toInt()
        var intAnswer = 1

        intAnswer = sqrt(intNum1.toDouble()).toInt()
        tvDisplay?.text = intAnswer.toString()
    }
    private fun pow(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()){
            tvDisplay?.text = "Please enter a valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 1

        for (i in 1..intNum2!!) {
            intAnswer *= intNum1
        }

        tvDisplay?.text = intAnswer.toString()

        /*
        var intNum1 = etNum1?.toString()!!.toInt()
        var intNum2 = etNum2?.toString()?.toInt()
        var intAnswer : Int = 1

        for (i in 1..intNum2!!){
            intAnswer = intAnswer * intNum1
        }
        tvDisplay?.text = intAnswer.toString()*/
    }
}