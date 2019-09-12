package com.example.nf.utils

import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.nf.adapters.MainPagesAdapter
import com.example.nf.fragments.FavoritesFragment
import com.example.nf.fragments.TagsFragment

class Utils{

    companion object{
        fun constructMainViewPager(viewPager: ViewPager, fm: FragmentManager){
            val mainPagesAdapter = MainPagesAdapter(fm)
            mainPagesAdapter.addFragment(TagsFragment(),"All Tags")
            mainPagesAdapter.addFragment(FavoritesFragment(),"Favorities")
            viewPager.adapter = mainPagesAdapter
        }
    }

}