package com.jy.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SubThreeActivity : AppCompatActivity() {


    private val iv : ImageView by lazy{
        findViewById(R.id.iv)
    }

    private val changeBtn : Button by lazy{
        findViewById(R.id.changeBtn)
    }
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_three)

        changeBtn.setOnClickListener {
            if(index == 0) {
                index = 1
                iv.setImageResource(R.drawable.catone)
            }else{
                index = 0
                iv.setImageResource(R.drawable.catthr)
            }
        }
    }
}