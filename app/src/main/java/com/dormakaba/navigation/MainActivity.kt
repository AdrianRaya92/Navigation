package com.dormakaba.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.dormakaba.navigation.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = CustomFragmentFactory()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewpager : ViewPager2 = binding.viewPager
        viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL


        val adapter = Adapter(this)
        adapter.addFragment(FragmentOne()) //TODO CHANGE WITH PLATFORM FRAGMENT WRAPPER
        adapter.addFragment(FragmentTwo()) //TODO CHANGE WITH CORE FRAGMENT WRAPPER
        adapter.addFragment(FragmentPlatformTwo()) //TODO CHANGE WITH DEVICE FRAGMENT WRAPPER

    //   val navHostFragment: NavHostFragment = supportFragmentManager
    //       .findFragmentById(R.id.navHostFragment) as NavHostFragment
      binding.tabStarterKit.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        viewpager.currentItem = 0
                   //    navHostFragment.findNavController()
                   //        .setGraph(R.navigation.nav_graph)
                    }
                    1 -> {
                        viewpager.currentItem = 1
                    //    navHostFragment.findNavController()
                    //        .setGraph(R.navigation.nav_graph_core)
                    }
                    2 -> {
                        viewpager.currentItem = 2
                     //   navHostFragment.findNavController()
                     //       .setGraph(R.navigation.nav_graph_platform)
                    }
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Write code to handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Write code to handle tab unselect
            }
        })
    }


    class Adapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
        private val fragmentList: ArrayList<Fragment> = ArrayList()
        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }

        fun addFragment(fragment: Fragment) {
            fragmentList.add(fragment)
        }

        override fun getItemCount(): Int {
            return fragmentList.size
        }
    }
}