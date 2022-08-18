package com.example.moneytracker.adapter

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moneytracker.R
import com.example.moneytracker.ui.UserData
import java.util.*
import kotlin.collections.ArrayList

class transectionadapter(list: ArrayList<UserData>): RecyclerView.Adapter<transectionadapter.ViewHolder>() {

    var list = list

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

   var date1 =itemView.findViewById<TextView>(R.id.date1)
   var categories1 =itemView.findViewById<TextView>(R.id.categories1)
   var transection1 =itemView.findViewById<TextView>(R.id.transection1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.trasectionitem,parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.date1.text =list.get(position).Date.toString()
        holder.categories1.text =list.get(position).Categories.toString()
        holder.transection1.text =list.get(position).Amount.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}