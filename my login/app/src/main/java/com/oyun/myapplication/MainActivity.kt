package com.oyun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //کد حذف نوار بالا (استتوس)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        img_button.setOnClickListener {
            img_button.setImageResource(R.drawable.group_6)
            Handler(Looper.getMainLooper()).postDelayed({
                img_button.setImageResource(R.drawable.group_5)
            }, 100)
        }


    }

}