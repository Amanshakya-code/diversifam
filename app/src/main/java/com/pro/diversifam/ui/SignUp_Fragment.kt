package com.pro.diversifam.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pro.diversifam.R
import com.pro.diversifam.databinding.FragmentSignUpBinding


class SignUp_Fragment : Fragment() {

    private lateinit var signUpBinding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        signUpBinding = FragmentSignUpBinding.inflate(inflater, container, false)

        val view = signUpBinding.root

        signUpBinding.SignUpBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_eventsFragment)
        }

        return view
    }

}