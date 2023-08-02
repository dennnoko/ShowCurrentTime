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

        //イベントリスナーを利用してみる
        val btnCurrent = findViewById<Button>(R.id.btnCurrent) //イベントリスナーの登録先を予め取得
        btnCurrent.setOnClickListener { //取得した登録先
            btnCurrentClick()
        }
    }

    fun btnCurrentClick() {
        var txtResult = findViewById<TextView>(R.id.textResult)
        txtResult.text = Date().toString()
    }

    //this fun run when btn is Clicked
    /*fun btnCurrentClick(v: View) { //ボタンのクリックされたタイミングでViewオブジェクトを引数としてvが渡される
        val txtResult = findViewById<TextView>(R.id.textResult) //現在時刻を表示するTextViewオブジェクトを取得
        txtResult.text = Date().toString() //txtResultに紐づけたTextViewオブジェクトのtextに日付をStringに変換して格納（Date()メソッドはjava.util.Date）
    }*/
}