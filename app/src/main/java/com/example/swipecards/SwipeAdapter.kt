package com.example.swipecards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class SwipeAdapter(private val mData:List<Int>):
    BaseAdapter(){
    override fun getCount(): Int {
        return mData.size
    }

    override fun getItem(position: Int): Any {
        return mData[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup?): View {
        var convertView: View = convertView
        convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.card_items, parent, false)
        val imgViewCard = convertView.findViewById(R.id.imgViewCard) as ImageView
        imgViewCard.setImageResource(mData[position])
        return convertView

    }
}