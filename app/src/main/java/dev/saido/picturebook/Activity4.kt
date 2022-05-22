package dev.saido.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity4 : AppCompatActivity() {
//    lateinit var btnBack5: Button
    lateinit var btnBack5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
//        btnNext5= findViewById(R.id.btnNext3)
        btnBack5=findViewById(R.id.btnBack5)
//        btnBack5.setOnClickListener {
//            val intent = Intent(this,Activity3::class.java)
//            startActivity(intent)
//        }

        btnBack5.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
//
    }
}