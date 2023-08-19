package com.example.neisha_quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            if(un.text.toString().isEmpty() || pw.text.toString().isEmpty()){
                Toast.makeText(this,
                "Please Enter Data",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizActivity::class.java)
                intent.putExtra(Constants.USER_NAME,un.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}

