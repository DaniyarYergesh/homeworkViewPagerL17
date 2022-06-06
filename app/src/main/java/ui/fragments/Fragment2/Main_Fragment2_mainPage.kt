package ui.fragments.Fragment2

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.homework_recyclerview.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Main_Fragment2_mainPage : Fragment(R.layout.fragment_2_personal_page) {

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar = view.findViewById(R.id.toolbar)

        val tabLayout = view.findViewById<TabLayout>(R.id.tablayout)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager2)
        val adapter = ViewPagerAdapter(requireActivity())
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = adapter.getPageTitle(position)
        }.attach()
    }
}