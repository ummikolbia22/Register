package com.ummi.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_sign_up.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.tv_sign_up){
            val inputUsername = et_username.toString().trim()
            val inputEmail = et_email.toString().trim()
            val inputPassword = et_password.toString().trim()
            val inputConfirmPassword = et_confirmpassword.toString().trim()
            var isEmptyField = false

            when {
                inputUsername.isEmpty() -> {
                    isEmptyField = true
                    et_username.error = getString(R.string.text_error)
                }
                inputEmail.isEmpty() -> {
                    isEmptyField = true
                    et_email.error = getString(R.string.text_error)
                }
                inputPassword.isEmpty() -> {
                    isEmptyField = true
                    et_password.error = getString(R.string.text_error)
                }
                inputConfirmPassword.isEmpty() -> {
                    isEmptyField = true
                    et_confirmpassword.error = getString(R.string.text_error)
                }
            }
            if (!isEmptyField) {
                val intentData = Intent(this, IsiData::class.java)
                intentData.putExtra("Username",inputUsername)
                intentData.putExtra("Email",inputEmail)
                intentData.putExtra("Password",inputPassword)
                intentData.putExtra("ConfirmPassword",inputConfirmPassword)
                startActivity(intentData)
            }

        }
    }
}