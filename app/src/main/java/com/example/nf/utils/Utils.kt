package com.example.nf.utils

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.nf.R
import com.example.nf.adapters.MainPagesAdapter
import com.example.nf.fragments.FavoritesFragment
import com.example.nf.fragments.TagsFragment
import kotlinx.android.synthetic.main.empty_show_item.view.*

class Utils{

    companion object{
        fun constructMainViewPager(viewPager: ViewPager, fm: FragmentManager){
            val mainPagesAdapter = MainPagesAdapter(fm)
            mainPagesAdapter.addFragment(TagsFragment(),"All Tags")
            mainPagesAdapter.addFragment(FavoritesFragment(),"Favorities")
            viewPager.adapter = mainPagesAdapter
        }

        fun getEmptyMessage(root: View,tittle:Int,description:Int):View{
           val t =  root.context.resources.getString(tittle)
           val d =  root.context.resources.getString(description)
           val inflater = LayoutInflater.from(root.context)

           val view = inflater.inflate(R.layout.empty_show_item,null)

           view.emptyMessageTittle.setText(t)
           view.emptyMessageDescription.setText(d)

            return view

        }
    }

}