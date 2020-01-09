package com.example.customlistviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mCtx: Context, var resources:Int, var items:List<Model>):ArrayAdapter<Model>(mCtx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources,null)

        val imageView:ImageView = view.findViewById(R.id.image)
        val fullnameTextView:TextView = view.findViewById(R.id.TextView1)
        val idstudentTextView:TextView = view.findViewById(R.id.TextView2)
        val mItem:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        fullnameTextView.text = mItem.fullname
        idstudentTextView.text = mItem.idstudent
        return view
        //super.getView(position, convertView, parent)
    }

}