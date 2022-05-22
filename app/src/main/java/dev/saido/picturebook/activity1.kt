package dev.saido.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity1 : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        btnBack=findViewById(R.id.btnBack)
        btnNext= findViewById(R.id.btnNext)
        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }
    }
}