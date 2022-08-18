package com.example.moneytracker.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneytracker.R
import com.example.moneytracker.adapter.expencereadapter
import com.example.moneytracker.databinding.FragmentSpending3Binding


class SpendingFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        var data = Databasemoney(context)
        var binding =FragmentSpending3Binding.inflate(layoutInflater)


        var list =data.RetriveData()
        binding.mdata.layoutManager =LinearLayoutManager(context)
        binding.mdata.adapter =expencereadapter(list)

        return binding.root
    }




    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SpendingFragment().apply {
                arguments = Bundle().apply {


                }
            }
    }
}