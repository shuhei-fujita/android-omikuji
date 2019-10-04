package com.example.android_omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        omikuji_button.setOnClickListener() {
//            Log.v("MainActivity","ButtonClicked")

            val n = Random.nextInt(3) //乱数代入
            result_text.text = n.toString()
        }
    }
}
