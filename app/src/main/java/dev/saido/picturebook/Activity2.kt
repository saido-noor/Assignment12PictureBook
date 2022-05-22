package dev.saido.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        btnBack2= findViewById(R.id.btnBack2)
        btnNext2= findViewById(R.id.btnNext2)
        btnBack2.setOnClickListener {
            val intent = Intent(this,activity1::class.java)
            startActivity(intent)
        }

        btnNext2.setOnClickListener {
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }
    }
}