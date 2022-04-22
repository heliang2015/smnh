package com.hl.ssnh.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Pager2Adapter(fragmentActivity: FragmentActivity, val listFragments: List<Fragment>) :
FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = listFragments.size

    override fun createFragment(position: Int): Fragment {
        return listFragments[position]
    }

}