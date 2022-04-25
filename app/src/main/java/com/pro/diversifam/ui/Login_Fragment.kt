package com.pro.diversifam.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pro.diversifam.R
import com.pro.diversifam.databinding.FragmentLoginBinding
import kotlin.math.log


class Login_Fragment : Fragment() {

    private lateinit var loginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        loginBinding = FragmentLoginBinding.inflate(inflater, container, false)

        val view = loginBinding.root

        loginBinding.GetOTPBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_OTPFragment)
        }

        loginBinding.SignUpTtv.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }

        return view
    }

}