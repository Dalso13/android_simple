package com.example.android_simple

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        
        // 레이아웃을 화면으로 보여주는 로직
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면 클릭
        val image1 = findViewById<ImageView>(R.id.bts_image_1)  // 이미지 id 가져오기
        image1.setOnClickListener { // 아이디 클릭
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG) // 토스트 (작은 팝업) 띄우기
                .show()
        }
        
    }
}