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
import com.dormakaba.navigation.databinding.FragmentCoreOneBinding
import com.dormakaba.navigation.databinding.FragmentOneBinding
import kotlinx.coroutines.launch

class FragmentCoreOne : Fragment(R.layout.fragment_core_one) {
    private val binding by viewBinding<FragmentCoreOneBinding>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}