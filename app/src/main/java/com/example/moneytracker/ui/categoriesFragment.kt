package com.example.moneytracker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneytracker.adapter.expencereadapter
import com.example.moneytracker.databinding.FragmentCategories3Binding
import com.example.moneytracker.databinding.FragmentSpending3Binding
import com.example.moneytracker.databinding.FragmentTransectionBinding

class categoriesFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


            var binding =FragmentCategories3Binding.inflate(layoutInflater)
        fun setOnCheckedChangeListener(listener: RadioGroup.OnCheckedChangeListener): Unit {

        }


        var data = Databasemoney(context)
        binding.save.setOnClickListener{

            var fdate = binding.date.text.toString()
            var fcategries = binding.categories.text.toString()
            var famount = binding.amount.text.toString()
            var fextranote = binding.extranote.text.toString()
            data.InsertData(fdate,fcategries.toString(),famount.toInt(),fextranote.toString())

            var list = data.RetriveData()

            var binding = FragmentSpending3Binding.inflate(layoutInflater)
            binding.mdata.layoutManager =LinearLayoutManager(context)
            binding.mdata.adapter =expencereadapter(list)

            var binding1 = FragmentTransectionBinding.inflate(layoutInflater)
            binding1.trans.layoutManager = LinearLayoutManager(context)
            binding1.trans.adapter=expencereadapter(list)





        }



        return binding.root

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            categoriesFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}