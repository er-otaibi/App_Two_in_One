package com.example.apptwo_in_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var numBtn: Button
    lateinit var phraseBtn: Button
    lateinit var choose: TextView
    lateinit var clMain: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        numBtn = findViewById(R.id.num)
        phraseBtn = findViewById(R.id.phrase)
        choose = findViewById(R.id.tvMain)
        clMain = findViewById(R.id.clMain)
        numBtn.setOnClickListener {
            val intent = Intent(this, NumsGame ::class.java)
            startActivity(intent)
        }
        phraseBtn.setOnClickListener {
            val intent = Intent(this, GusessPhrase ::class.java)
            startActivity(intent)
        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.number_game -> {
                Snackbar.make(clMain, "Numbers Game!", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.guess_Phrase -> {
                Snackbar.make(clMain, "Calculator", Snackbar.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}