package com.ssafy.gumichelin.src.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ssafy.gumichelin.R
import com.ssafy.gumichelin.config.BaseActivity
import com.ssafy.gumichelin.databinding.ActivityLoginBinding
import com.ssafy.gumichelin.src.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout_login, LoginFragment())
            .commit()
    }

    fun openFragment(int: Int){
        val transaction = supportFragmentManager.beginTransaction()
        when(int){
            1 -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent)
            }
            2 -> transaction.replace(R.id.frame_layout_login, Join1Fragment())
                .addToBackStack(null)
            3 -> transaction.replace(R.id.frame_layout_login, Join2Fragment())
                .addToBackStack(null)
            4 -> transaction.replace(R.id.frame_layout_login, Join3Fragment())
                .addToBackStack(null)

            5 -> transaction.replace(R.id.frame_layout_login, LoginFragment())
                .addToBackStack(null)
        }
        transaction.commit()
    }
}