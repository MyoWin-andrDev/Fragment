package com.learning.fragement.util

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.learning.fragement.R

fun FragmentManager.replaceFragment(
    fragment: Fragment,
    input: String? = null,
) {
    if (!input.isNullOrEmpty()) {
        fragment.arguments = Bundle().apply {
            putString("USER_INPUT", input)
        }
    }

    beginTransaction().apply {
        replace(R.id.fcMainActivity, fragment)
        addToBackStack(null)
        commit()
    }
}


