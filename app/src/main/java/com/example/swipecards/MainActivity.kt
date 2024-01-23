package com.example.swipecards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var mData:ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mData = ArrayList()
        val swipeStack = findViewById<View>(R.id.swipeStack) as SwipeStack
        swipeStack.adapter = SwipeAdapter(mData)
        getImgData()
    }
    private fun getImgData() {
        mData.add(R.drawable.no_pic1)
        mData.add(R.drawable.no_pic2)
        mData.add(R.drawable.no_pic3)
        mData.add(R.drawable.no_pic4)
        mData.add(R.drawable.re_pic1)
        mData.add(R.drawable.re_pic2)
        mData.add(R.drawable.re_pic3)
        mData.add(R.drawable.re_pic4)
        mData.add(R.drawable.re_pic5)



    }
}