package com.example.nf.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.nf.R
import com.example.nf.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        Utils.constructMainViewPager(viewPager,supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
        bottomNavaigationView.itemIconTintList = null


    }

}
