package com.app.elearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.app.elearning.home.HomeScreen

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        var handler = Handler();
        handler.postDelayed({
            val intent = Intent(this@SplashScreen,HomeScreen::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}
