package com.sv053.reddit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_onboarding.*

class BoardingFragment : Fragment(R.layout.fragment_onboarding) {

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)

            goLoginBtn.setOnClickListener{changeFragment()}
        }

        private fun changeFragment(){
            val r = R.id.loginFragment
            findNavController().navigate(R.id.loginFragment)
        }
    }