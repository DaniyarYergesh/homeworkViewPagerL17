package ui.fragments.Fragment2

import android.app.Activity
import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import ui.fragments.Fragment2.viewPagerFragments.FirstFragment
import ui.fragments.Fragment2.viewPagerFragments.SecondFragment
import ui.fragments.Fragment2.viewPagerFragments.ThirdFragment

class ViewPagerAdapter(fm: FragmentActivity): FragmentStateAdapter(fm) {

    private val fragments = mutableListOf(
        FirstFragment(), SecondFragment(), ThirdFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    fun getPageTitle(position: Int): CharSequence{
         return when(fragments[position]){
            is FirstFragment -> "Основные"
            is SecondFragment -> "Статистика"
            else -> "Еще один таб"
        }
    }
}