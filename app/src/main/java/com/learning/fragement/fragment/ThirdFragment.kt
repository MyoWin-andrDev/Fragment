package com.learning.fragement.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.fragement.R
import com.learning.fragement.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third){
    private lateinit var binding : FragmentThirdBinding
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)
        val userInput = arguments?.getString("USER_INPUT").orEmpty()
        binding.tvTitle.text = if(!userInput.isEmpty()) userInput else "Welcome to Third Fragment"
    }
}