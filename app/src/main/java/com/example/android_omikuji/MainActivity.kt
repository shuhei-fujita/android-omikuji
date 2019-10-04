package com.example.android_omikuji

import android.graphics.Color
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
            val results = arrayOf("大吉", "中吉", "吉", "凶") //arrayで配列を定義

            val n = Random.nextInt(results.count()) //乱数代入

            //大吉の時は文字を赤くする実装
            if (n == 0) {
                result_text.setTextColor(Color.RED)
            } else {
                result_text.setTextColor(Color.GRAY)
            }

            result_text.text = results.get(n)   //result_buttonidのtext要素に代入
        }
    }
}
