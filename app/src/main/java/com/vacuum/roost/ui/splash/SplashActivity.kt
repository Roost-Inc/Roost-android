package com.vacuum.roost.ui.splash

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.vacuum.roost.R
import android.content.Intent
import com.vacuum.roost.ui.main.MainActivity





class SplashActivity : AppCompatActivity(),SplashMvpView {

    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, SplashActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


    }



    override fun openLoginActivity() {
    }

    override fun openMainActivity() {
        val intent = MainActivity.getStartIntent(this@SplashActivity)
        startActivity(intent)
        finish()
    }



}
