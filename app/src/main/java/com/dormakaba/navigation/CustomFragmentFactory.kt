package com.dormakaba.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

//This is just an example, Dagger(Hilt) or Koin are better options to DI or service locator
class CustomFragmentFactory : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            FragmentOne::class.java.name -> FragmentOne()
            FragmentTwo::class.java.name -> FragmentTwo()
            FragmentCoreOne::class.java.name -> FragmentCoreOne()
            FragmentPlatformOne::class.java.name -> FragmentPlatformOne()
            FragmentPlatformTwo::class.java.name -> FragmentPlatformTwo()
            else -> return super.instantiate(classLoader, className)
        }
    }
}
