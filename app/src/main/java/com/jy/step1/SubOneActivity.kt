package com.jy.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubOneActivity : AppCompatActivity() {

    private val nameTv : TextView by lazy{
        findViewById(R.id.nameTv)
    }

    private val heightTv : TextView by lazy{
        findViewById(R.id.heightTv)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_one)

        val name = intent.getStringExtra("name")
        val height = intent.getStringExtra("height")

        nameTv.text = "이름 : " + name
        heightTv.text = "키 : " + height

    }
}