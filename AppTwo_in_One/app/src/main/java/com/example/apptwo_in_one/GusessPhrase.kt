package com.example.apptwo_in_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class GusessPhrase : AppCompatActivity() {
    lateinit var number1: EditText
    lateinit var number2: EditText
    lateinit var add1: Button
    lateinit var minus1: Button
    lateinit var multiply1: Button
    lateinit var divition1: Button
    lateinit var theResult: Button
    lateinit var clRoot: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gusess_phrase)
        number1 = findViewById(R.id.num1)
        number2 = findViewById(R.id.num2)
        add1 = findViewById(R.id.add)
        minus1 = findViewById(R.id.minus)
        multiply1 = findViewById(R.id.multiply)
        divition1 = findViewById(R.id.divition)
        theResult = findViewById((R.id.result))
        clRoot = findViewById(R.id.clMainPhase)


        add1.setOnClickListener { addFunction() }
        minus1.setOnClickListener { minusFunction()}
        multiply1.setOnClickListener { multiplyFunction()}
        divition1.setOnClickListener {  divitionFunction()}

    }

    fun addFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        var r = n1 + n2
        theResult.text = r.toString()
    }
    fun minusFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        var r = n1-n2
        theResult.text = r.toString()
    }
    fun multiplyFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        var r = n1*n2
        theResult.text = r.toString()
    }
    fun divitionFunction(){

        var n1 =  number1.text.toString().toInt()
        var n2 = number2.text.toString().toInt()
        val r = n1/n2
        theResult.text = r.toString()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sub_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.number_game -> {
                Snackbar.make(clRoot, "Numbers Game!", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.guess_Phrase -> {
                Snackbar.make(clRoot, "Calculator", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.main_menu -> {
                Snackbar.make(clRoot, "Main Menu", Snackbar.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }



}