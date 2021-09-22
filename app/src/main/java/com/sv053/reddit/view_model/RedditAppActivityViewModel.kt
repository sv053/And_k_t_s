package com.sv053.reddit.view_model

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.sv053.reddit.R
import kotlinx.android.synthetic.main.fragment_login.*

class RedditAppActivityViewModel : AppCompatActivity(){

    private lateinit var emailEditText: TextInputEditText

    private val viewModel: RedditAppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        emailEditText = findViewById(R.id.email)

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            viewModel.writeLogin(email.editableText?.take(50).toString())
        }

        viewModel.state.observe(this, { state ->
            emailEditText.text = state.login as Editable
        })
    }
}