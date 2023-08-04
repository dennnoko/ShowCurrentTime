package com.example.viewtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.viewtestapp.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : AppCompatActivity() {
    //ViewBinding
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCurrent.setOnClickListener {
            binding.textResult.text = Date().toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) { //Activityが破棄されるタイミングで実行されるメソッド //Bundleはアプリの状態をキーと値の組み合わせで管理するためのオブジェクト
        super.onSaveInstanceState(outState) //親クラスのonSaveInstanceState()を呼び出す
        val txtResult = findViewById<TextView>(R.id.textResult) //Viewの取得と値の保存
        outState.putString("txtResult", txtResult.text.toString())

        //Toast 短時間の短いメッセージの表示（ちょっとした通知や開発時のログ表示に使用する）
        val toast = Toast.makeText(this,
            "Activityの破棄時にonSaveInstanceStateが実行される", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) { //Activityが再生成されるときに実行されるメソッド
        super.onRestoreInstanceState(savedInstanceState) //親クラスのonRestoreInstanceState()を呼び出す
        val txtResult = findViewById<TextView>(R.id.textResult) //Viewの取得と値の代入
        txtResult.text = savedInstanceState.getString("txtResult")

        //Toast
        val toast = Toast.makeText(this,
            "Activityの再生成時にonRestoreInstanceStateが実行される", Toast.LENGTH_LONG)
        toast.show()
    }
}