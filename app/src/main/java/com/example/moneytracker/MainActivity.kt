package com.example.moneytracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.moneytracker.adapter.ViewPagerAdapter
import com.example.moneytracker.databinding.ActivityMainBinding
import com.example.moneytracker.ui.Databasemoney
import com.example.moneytracker.ui.SpendingFragment
import com.example.moneytracker.ui.categoriesFragment
import com.example.moneytracker.ui.transectionFragment


class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val  fragmentArrayList = ArrayList<Fragment>()

        fragmentArrayList .add(SpendingFragment())
        fragmentArrayList .add(transectionFragment())
        fragmentArrayList .add(categoriesFragment())

        val adapter = ViewPagerAdapter(this,supportFragmentManager,fragmentArrayList)

        binding!!.viewPager.adapter = adapter
        binding!!.tabs.setupWithViewPager(binding!!.viewPager)



        }

    }
