package com.learning.fragement.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.learning.fragement.R
import com.learning.fragement.databinding.FragmentSecondBinding
import com.learning.fragement.util.replaceFragment

class SecondFragment : Fragment(R.layout.fragment_second) {
    private val binding by lazy { FragmentSecondBinding.bind(requireView()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btGoNext.setOnClickListener {
            requireActivity().supportFragmentManager.replaceFragment(
                ThirdFragment(),
                binding.etInput.text.toString()
            )
        }
    }
}