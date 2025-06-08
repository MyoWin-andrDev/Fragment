package com.learning.fragement.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.learning.fragement.R
import com.learning.fragement.databinding.FragmentFirstBinding
import com.learning.fragement.util.replaceFragment

class FirstFragment : Fragment(R.layout.fragment_first) {
    private val binding by lazy { FragmentFirstBinding.bind(requireView()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btGoNext.setOnClickListener {
            requireActivity().supportFragmentManager.replaceFragment(SecondFragment())
        }
    }
}