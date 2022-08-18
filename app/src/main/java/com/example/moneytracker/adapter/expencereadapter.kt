package com.example.moneytracker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moneytracker.R
import com.example.moneytracker.ui.UserData

class expencereadapter(list: ArrayList<UserData>): RecyclerView.Adapter<expencereadapter.UserHolder>() {

    var list = list

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var Categories = itemView.findViewById<TextView>(R.id.categories)
        var Amount = itemView.findViewById<TextView>(R.id.amount)

    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {

     holder.Categories.text =list.get(position).Categories.toString()
     holder.Amount.text =list.get(position).Amount.toString()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        return UserHolder(LayoutInflater.from(parent.context).inflate(R.layout.expencerecyclview,parent,false))
    }
}