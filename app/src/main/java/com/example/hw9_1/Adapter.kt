package com.example.hw9_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(var dataList: ArrayList<Movie>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView1)
        val textView: TextView = view.findViewById(R.id.textView1)
        val heart: ImageView = view.findViewById(R.id.iv_heart1)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_recycler_view, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dataList[position].image)
        holder.textView.text = dataList[position].name
//        holder.tvBalance.text = dataList[position].balance
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
