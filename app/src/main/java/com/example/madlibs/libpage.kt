package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class libpage : AppCompatActivity() {

    val player = "player"
    val word1 = "word"
    val word2 = "word"
    val word3 = "word"
    val word4 = "word"
    val word5 = "word"
    val word6 = "word"
    val word7 = "word"
    val word8 = "word"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libpage)

        val playerName = intent.getStringExtra(player)
        val text1 = intent.getStringExtra(word1)
        val text2 = intent.getStringExtra(word2)
        val text3 = intent.getStringExtra(word3)
        val text4 = intent.getStringExtra(word4)
        val text5 = intent.getStringExtra(word5)
        val text6 = intent.getStringExtra(word6)
        val text7 = intent.getStringExtra(word7)
        val text8 = intent.getStringExtra(word8)


        val message1 = findViewById<TextView>(R.id.message1).apply{
            text = "Hello"
        }
        val playerView = findViewById<TextView>(R.id.playerView).apply {
            text = playerName
        }
    }
}
