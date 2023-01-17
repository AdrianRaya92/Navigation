package com.dormakaba.navigation

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.dormakaba.navigation.databinding.FragmentOneBinding
import com.dormakaba.navigation.databinding.FragmentTwoBinding
import kotlinx.coroutines.launch

class FragmentTwo : Fragment(R.layout.fragment_two) {
    private val binding by viewBinding<FragmentTwoBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    private fun setUp(){
        with(binding){
            button.setOnClickListener {
                findNavController().navigate(R.id.action_fragment_two_to_one)
            }
        }
    }
}