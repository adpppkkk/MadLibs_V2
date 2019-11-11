package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.view.isInvisible
import android.text.TextUtils
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {
    val player = "player"
    val word1 = "word_1"
    val word2 = "word_2"
    val word3 = "word_3"
    val word4 = "word_4"
    val word5 = "word_5"
    val word6 = "word_6"
    val word7 = "word_7"
    val word8 = "word_8"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





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


        if (playerName.isEmpty()) {
            findViewById<EditText>(R.id.player)?.error = "PlayerName Needed!"
        }
        if (input1.isEmpty()) {
            findViewById<EditText>(R.id.text1)?.error = "A word is needed here!"
        }
        if (input2.isEmpty()) {
            findViewById<EditText>(R.id.text2)?.error = "A word is needed here!"
        }
        if (input3.isEmpty()) {
            findViewById<EditText>(R.id.text3)?.error = "A word is needed here!"
        }
        if (input4.isEmpty()) {
            findViewById<EditText>(R.id.text4)?.error = "A word is needed here!"
        }
        if (input5.isEmpty()) {
            findViewById<EditText>(R.id.text5)?.error = "A word is needed here!"
        }
        if (input6.isEmpty()) {
            findViewById<EditText>(R.id.text6)?.error = "A word is needed here!"
        }
        if (input7.isEmpty()) {
            findViewById<EditText>(R.id.text7)?.error = "A word is needed here!"
        }
        if (input8.isEmpty()) {
            findViewById<EditText>(R.id.text8)?.error = "A word is needed here!"
        }
        else {
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
}
