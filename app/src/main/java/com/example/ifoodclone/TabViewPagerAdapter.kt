package com.example.ifoodclone

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    val tabs = arrayOf(R.string.restaurants, R.string.marketplaces, R.string.drinks)
    private val fragments = arrayOf(MarketPlaceFragment(), MarketPlaceFragment(), MarketPlaceFragment())

    override fun getItemCount() = fragments.size
    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}