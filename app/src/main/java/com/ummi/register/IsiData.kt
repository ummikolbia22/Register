package com.ummi.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.isi_data.*

class IsiData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isi_data)

        val setUsername = intent.getStringExtra("Username")
        val setEmail = intent.getStringExtra("Email")
        val setPassword = intent.getStringExtra("Password")
        val setConfirmPassword = intent.getStringExtra("ConfirmPassword")


        tv_name1.text = setUsername
        tv_email1.text = setEmail
        tv_password.text = setPassword
        tv_confirm_pass.text = setConfirmPassword
    }
}