package com.example.my_customlist_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class my_adapter(var mycontext:Context, val resources:Int, var item:List<models>):ArrayAdapter<models>(mycontext,resources,item) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mycontext)
        val view:View = layoutInflater.inflate(resources, null)
        val imageView:ImageView = view.findViewById(R.id.image)
        val tv_title:TextView = view.findViewById(R.id.tv_maintext)
        val tv_description:TextView = view.findViewById(R.id.tv_subtext)

        var myitems:models = item[position]
        imageView.setImageDrawable(mycontext.resources.getDrawable(myitems.img))
        tv_title.text=myitems.title
        tv_description.text=myitems.description
        return view
    }
}