package com.ssafy.gumichelin.src.login

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ssafy.gumichelin.R
import com.ssafy.gumichelin.config.BaseFragment
import com.ssafy.gumichelin.databinding.FragmentJoin3Binding
import com.ssafy.gumichelin.databinding.FragmentLoginBinding

class Join3Fragment: BaseFragment<FragmentJoin3Binding>(FragmentJoin3Binding::bind, R.layout.fragment_join3) {

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

    }
}