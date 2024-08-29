package com.example.ui_design

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ui_design.databinding.ActivityAccountVerificationBinding
import com.example.ui_design.databinding.ActivityLogInBinding

class Account_Verification : AppCompatActivity() {
    private lateinit var binding: ActivityAccountVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountVerificationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.lblResendCode.setOnClickListener {
            //Resend Code Process Start
        }
        binding.btnVerify.setOnClickListener {
            //Verify Process Start
        }
        }

    }
