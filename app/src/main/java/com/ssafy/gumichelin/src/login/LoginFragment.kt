package com.ssafy.gumichelin.src.login

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ssafy.gumichelin.R
import com.ssafy.gumichelin.config.BaseFragment
import com.ssafy.gumichelin.databinding.FragmentLoginBinding

class LoginFragment: BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::bind, R.layout.fragment_login) {

    private lateinit var loginActivity: LoginActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        loginActivity = context as LoginActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goJoinButton.setOnClickListener {
            loginActivity.openFragment(2)
        }
    }
}