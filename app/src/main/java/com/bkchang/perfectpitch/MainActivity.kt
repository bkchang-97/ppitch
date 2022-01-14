package com.bkchang.perfectpitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

val QUESTION_BANK_JMC1 = mutableSetOf<Question>()
val QUESTION_BANK_JMC2 = mutableSetOf<Question>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        try {
//            startService(Intent(this@MainActivity,
//                SoundService::class.java))
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

        val button = findViewById<Button>(R.id.button)
            button.setOnClickListener {
                val intent = Intent(this, ChooseLevel::class.java)
                startActivity(intent)
            }

        val button2 = findViewById<Button>(R.id.button2)
            button2.setOnClickListener {
                val intent = Intent(this, About::class.java)
                startActivity(intent) }

        QUESTION_BANK_JMC1.add(Question(R.raw.do_mi_so, "do_mi_so", R.drawable.do_mi_so))
        QUESTION_BANK_JMC1.add(Question(R.raw.si_fa_so, "si_fa_so", R.drawable.si_fa_so))
        QUESTION_BANK_JMC1.add(Question(R.raw.so_si_re, "so_si_re", R.drawable.so_si_re))
        QUESTION_BANK_JMC1.add(Question(R.raw.fa_do_re, "fa_do_re", R.drawable.fa_do_re))
        QUESTION_BANK_JMC1.add(Question(R.raw.fa_la_do, "fa_la_do", R.drawable.fa_la_do))
        QUESTION_BANK_JMC1.add(Question(R.raw.mi_si_do, "mi_si_do", R.drawable.mi_si_do))

        QUESTION_BANK_JMC2.add(Question(R.raw.do_mi_so, "do_mi_so", R.drawable.do_mi_so))
        QUESTION_BANK_JMC2.add(Question(R.raw.si_fa_so, "si_fa_so", R.drawable.si_fa_so))
        QUESTION_BANK_JMC2.add(Question(R.raw.so_si_re, "so_si_re", R.drawable.so_si_re))
        QUESTION_BANK_JMC2.add(Question(R.raw.fa_do_re, "fa_do_re", R.drawable.fa_do_re))
        QUESTION_BANK_JMC2.add(Question(R.raw.fa_la_do, "fa_la_do", R.drawable.fa_la_do))
        QUESTION_BANK_JMC2.add(Question(R.raw.mi_si_do, "mi_si_do", R.drawable.mi_si_do))
        QUESTION_BANK_JMC2.add(Question(R.raw.re_fa_la, "re_fa_la", R.drawable.re_fa_la))
        QUESTION_BANK_JMC2.add(Question(R.raw.do_so_la, "do_so_la", R.drawable.do_so_la))
        QUESTION_BANK_JMC2.add(Question(R.raw.la_do_mi, "la_do_mi", R.drawable.la_do_mi))
        QUESTION_BANK_JMC2.add(Question(R.raw.so_re_mi, "so_re_mi", R.drawable.so_re_mi))

    }

}
