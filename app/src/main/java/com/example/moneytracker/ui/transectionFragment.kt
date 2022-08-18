package com.example.moneytracker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneytracker.R
import com.example.moneytracker.adapter.expencereadapter
import com.example.moneytracker.adapter.transectionadapter
import com.example.moneytracker.databinding.ActivityMainBinding.inflate
import com.example.moneytracker.databinding.FragmentTransectionBinding


class transectionFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

       var binding =FragmentTransectionBinding.inflate(layoutInflater)

        var data = Databasemoney(context)
        var list = data.RetriveData()

        binding.trans.layoutManager =LinearLayoutManager(context)
        binding.trans.adapter=transectionadapter(list)



        return binding.root
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            transectionFragment().apply {
                arguments = Bundle().apply {
                }
            }

        }
    }
