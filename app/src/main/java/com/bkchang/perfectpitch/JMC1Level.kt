package com.bkchang.perfectpitch

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JMC1Level : AppCompatActivity() {
    val question = QUESTION_BANK_JMC1.random()
    val answers = QUESTION_BANK_JMC1.filter { it != question }.map {it}
    val wrong_answer_1 = answers.random()
    val wrong_answer_2 = (answers.filter { it != wrong_answer_1 }.map { it }).random()
    val answer_choices = mutableListOf<Question>(question, wrong_answer_1, wrong_answer_2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_j_m_c1_level)
        val player = MediaPlayer.create(this, question.chord)
        player.start()

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {player.start()}

        answer_choices.shuffle()

        val answer1 = findViewById<Button>(R.id.Answer1)
        answer1.setBackgroundResource(answer_choices.elementAt(0).image)
        answer1.setOnClickListener{
            val intent = Intent(this, JMC1Level::class.java)
            if (answer_choices.elementAt(0) == question){
                startActivity(intent) }
            else
            {player.start()}
        }


        val answer2 = findViewById<Button>(R.id.Answer2)
        answer2.setBackgroundResource(answer_choices.elementAt(1).image)
        answer2.setOnClickListener{
            val intent = Intent(this, JMC1Level::class.java)
            if (answer_choices.elementAt(1) == question) {
                startActivity(intent)}
            else
            {player.start()}
        }

        val answer3 = findViewById<Button>(R.id.Answer3)
        answer3.setBackgroundResource(answer_choices.elementAt(2).image)
        answer3.setOnClickListener{
            val intent = Intent(this, JMC1Level::class.java)
            if (answer_choices.elementAt(2) == question){
                startActivity(intent) }
            else
            {player.start()}
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, ChooseLevel::class.java)
        startActivity(intent)
    }

}