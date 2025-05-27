package com.learning.fragement.Util

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.learning.fragement.R
import com.learning.fragement.fragment.FirstFragment

fun FragmentManager.replaceFragment(fragment: Fragment, input : String? = null){
    if(!input.isNullOrEmpty()){
        fragment.arguments = Bundle().apply {
            putString("USER_INPUT", input)
        }
    }
    beginTransaction().apply {
        replace(R.id.fcMainActivity, fragment)
        addToBackStack("")
        commit()
    }
}