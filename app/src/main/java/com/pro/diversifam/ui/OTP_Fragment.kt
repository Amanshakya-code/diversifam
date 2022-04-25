package com.pro.diversifam.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pro.diversifam.R
import com.pro.diversifam.databinding.FragmentOTPBinding


class OTP_Fragment : Fragment() {


    private lateinit var otpBinding : FragmentOTPBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        otpBinding = FragmentOTPBinding.inflate(inflater, container, false)

        val view = otpBinding.root

        otpBinding.LoginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_OTPFragment_to_eventsFragment)
        }

        return view
    }

}