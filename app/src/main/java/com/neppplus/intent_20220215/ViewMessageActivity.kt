package com.neppplus.intent_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        화면이 시작되면 바로 문구 설정

//        이전화면에서 ("message" 이름표 붙여서) 첨부한 문구받기

        val message = intent.getStringExtra("message")

        txtMessage.text = message

    }
}