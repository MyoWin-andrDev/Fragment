package com.learning.fragement.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.learning.fragement.R
import com.learning.fragement.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second){
    private lateinit var binding : FragmentSecondBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
        binding.btGoNext.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fcMainActivity,
                ThirdFragment().also { it.arguments = Bundle().also {
                it.putString("USER_INPUT", binding.etInput.text.toString())
            }}).addToBackStack("").commit()
        }
    }
}