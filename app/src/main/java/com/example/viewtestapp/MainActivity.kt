package com.example.viewtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //イベントリスナーを利用してみる。ラムダ式を利用
        val btnCurrent = findViewById<Button>(R.id.btnCurrent) //イベントリスナーの登録先のViewを予め取得
        btnCurrent.setOnClickListener({v: View -> //setOnClickListenerメソッドを呼び出し、ボタンにクリックリスナーを登録している。クリックリスナーとしてラムダ式が使用されている。
            val txtResult = findViewById<TextView>(R.id.textResult) //Viewの取得
            txtResult.text = Date().toString() //取得したViewのtextプロパティに値を代入
        })
    }
}