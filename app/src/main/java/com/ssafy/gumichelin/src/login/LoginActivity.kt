package com.ssafy.gumichelin.src.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ssafy.gumichelin.R
import com.ssafy.gumichelin.config.BaseActivity
import com.ssafy.gumichelin.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_login, LoginFragment())
            .commit()
    }
}