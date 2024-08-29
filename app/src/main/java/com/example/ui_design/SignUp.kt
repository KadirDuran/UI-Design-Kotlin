package com.example.ui_design

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ui_design.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,LogIn::class.java)).apply {
                //putExtra("Key", value) değer gönderilebilir.
            }
        }
    }
}