package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class libpage : AppCompatActivity() {

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
            text = text1
        }
        val message2 = findViewById<TextView>(R.id.message2).apply{
            text = text2
        }
        val message3 = findViewById<TextView>(R.id.message3).apply{
            text = text3
        }
        val message4 = findViewById<TextView>(R.id.message4).apply{
            text = text4
        }
        val message5 = findViewById<TextView>(R.id.message5).apply{
            text = text5
        }
        val message6 = findViewById<TextView>(R.id.message6).apply{
            text = text6
        }
        val message7 = findViewById<TextView>(R.id.message7).apply{
            text = text7
        }
        val message8 = findViewById<TextView>(R.id.message8).apply{
            text = text8
        }
        val playerView = findViewById<TextView>(R.id.playerView).apply {
            text = playerName
        }
    }
}
// comment just for submit