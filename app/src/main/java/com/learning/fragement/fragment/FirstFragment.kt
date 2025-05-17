package com.learning.fragement.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.fragement.R
import com.learning.fragement.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first){
    private lateinit var binding : FragmentFirstBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        binding.btGoNext.setOnClickListener {
            val secondFragment = SecondFragment()
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fcMainActivity, secondFragment).addToBackStack("").commit()
        }
    }
}