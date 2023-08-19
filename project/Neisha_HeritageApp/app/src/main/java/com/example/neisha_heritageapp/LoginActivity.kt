package com.example.neisha_heritageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.neisha_heritageapp.fragment.InfoFragment
import com.example.neisha_heritageapp.fragment.ProfileFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var un = findViewById<EditText>(R.id.un)
        var pw = findViewById<EditText>(R.id.pw)
        var btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {
            if(un.text.toString().isEmpty() || pw.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Please Enter Data", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra(ProfileFragment.NAME,un.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}