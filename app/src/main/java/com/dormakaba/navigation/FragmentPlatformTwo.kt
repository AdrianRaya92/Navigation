package com.dormakaba.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import com.dormakaba.navigation.databinding.ActivityMainBinding
import com.dormakaba.navigation.databinding.FragmentOneBinding
import com.dormakaba.navigation.databinding.FragmentPlatformOneBinding
import com.dormakaba.navigation.databinding.FragmentPlatformTwoBinding
import kotlinx.coroutines.launch

class FragmentPlatformTwo : Fragment(R.layout.fragment_platform_two) {
    private val binding by viewBinding<FragmentPlatformTwoBinding>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            button.setOnClickListener {
                findNavController().navigate(R.id.action_fragment_platform_two_to_one)
            }
        }
    }
}