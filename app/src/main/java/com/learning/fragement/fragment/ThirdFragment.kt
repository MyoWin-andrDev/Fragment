package com.learning.fragement.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.learning.fragement.R
import com.learning.fragement.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private val binding by lazy { FragmentThirdBinding.bind(requireView()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userInput = arguments?.getString("USER_INPUT").orEmpty()
        binding.tvTitle.text =
            if (userInput.isNotBlank()) userInput else "Welcome to Third Fragment."
    }
}
