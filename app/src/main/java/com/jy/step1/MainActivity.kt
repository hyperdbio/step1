package com.jy.step1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {


    private val subOneBtn : Button by lazy {
        findViewById(R.id.btn1)
    }
    private val subTwoBtn : Button by lazy{
        findViewById(R.id.btn2)

    }
    private val subThreeBtn : Button by lazy {
        findViewById(R.id.btn3)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        subOneBtn.setOnClickListener {
            val intent = Intent(this, SubOneActivity::class.java)
            intent.putExtra("name", "김윤수")
            intent.putExtra("height", "175")
            startActivity(intent)


        }

        subTwoBtn.setOnClickListener {
            val intent = Intent(this, SubTwoActivity::class.java)
            startActivity(intent)

        subThreeBtn.setOnClickListener {
            val intent = Intent(this, SubThreeActivity::class.java)
            startActivity(intent)
        }
        }
    }
}