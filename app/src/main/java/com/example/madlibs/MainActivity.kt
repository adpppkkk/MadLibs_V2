package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val player = "player"
    val word1 = "word"
    val word2 = "word"
    val word3 = "word"
    val word4 = "word"
    val word5 = "word"
    val word6 = "word"
    val word7 = "word"
    val word8 = "word"



    fun createMadLib(view: View) {
        val playerName = findViewById<EditText>(R.id.player).text.toString()
        val input1 = findViewById<EditText>(R.id.text1).text.toString()
        val input2 = findViewById<TextView>(R.id.text2).text.toString()
        val input3 = findViewById<TextView>(R.id.text3).text.toString()
        val input4 = findViewById<TextView>(R.id.text4).text.toString()
        val input5 = findViewById<TextView>(R.id.text5).text.toString()
        val input6 = findViewById<TextView>(R.id.text6).text.toString()
        val input7 = findViewById<TextView>(R.id.text7).text.toString()
        val input8 = findViewById<TextView>(R.id.text8).text.toString()

        val intent = Intent(this,libpage::class.java).apply {
            putExtra(player, playerName)
            putExtra(word1, input1)
            putExtra(word2, input2)
            putExtra(word3, input3)
            putExtra(word4, input4)
            putExtra(word5, input5)
            putExtra(word6, input6)
            putExtra(word7, input7)
            putExtra(word8, input8)

        }
        startActivity(intent)

    }
}
