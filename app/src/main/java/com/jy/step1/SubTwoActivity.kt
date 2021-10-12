package com.jy.step1

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class SubTwoActivity : AppCompatActivity() {
    private val savedTv : TextView by lazy{
        findViewById(R.id.savedTv)
    }

    private val inputEdt : EditText by lazy{
        findViewById(R.id.inputEdt)
    }
    private val saveBtn : Button by lazy{
        findViewById(R.id.saveBtn)
    }
    private val prefName = "pref"
    private val prefKey = "myKey"
    private val prefs : SharedPreferences by lazy{
        applicationContext.getSharedPreferences(prefName, 0)
    }

    private lateinit var editor : SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_two)

        editor = prefs.edit()

        val data = prefs.getString(prefName, "Not Inputed")

        if(!data.equals("Not Inputed")) {
            savedTv.text = data
        }

        saveBtn.setOnClickListener {
            if(inputEdt.text.isNotEmpty()) {
                val getData = inputEdt.text.toString()
                editor.putString(prefName, getData)
                editor.apply()

                Toast.makeText(this, "저장됨", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"입력해주삼", Toast.LENGTH_SHORT).show()
            }
        }
    }
}