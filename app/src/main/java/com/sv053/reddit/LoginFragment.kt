package com.sv053.reddit

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.ui.res.colorResource
import androidx.core.content.ContextCompat
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login){//}, View.OnClickListener {

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
         //   super.onAttach(Activity())
                loginButton.isEnabled = false

            emailLayout.editText?.doOnTextChanged { inputEmail, _, _, _ ->
                // Respond to input text change
              val inputEmail = email.editableText?.take(50).toString()

                val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(inputEmail).matches()
                when(isEmailValid){
                   true -> email.setBackgroundColor(Color.LTGRAY)
                   false -> {
                        email.setBackgroundColor(Color.RED)
                    }
                }
                passLayout.editText?.doOnTextChanged{ inputPass, _,_,_ ->

                    val digits: Int? = inputPass?.length ?: inputPass?.length // .compareTo(8)
                    when(digits?.toInt()!! > 8){
                        true -> {
                            password.setBackgroundColor(Color.LTGRAY)
                            loginButton.isEnabled = true
                            loginButton.setOnClickListener{ goNext() }
                        }
                        false -> {
                            password.setBackgroundColor(Color.RED)
                        }
                    }
                }
            }
        }

       private fun goNext(){
           findNavController().navigate(R.id.afterLoginFragment)

        }

}