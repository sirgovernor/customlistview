package com.example.my_customlist_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView> (R.id.listview)
        var list = mutableListOf<models>()

       // addlist
        list.add(models("insatgram","This is our instagram", R.drawable.instagram))
        list.add(models("laugh","This is our laugh", R.drawable.laugh))
        list.add(models("melting","This is our melting", R.drawable.melting))
        list.add(models("nerd","This is our nerd", R.drawable.nerd))
        list.add(models("proud","This is our proud", R.drawable.proud))
        list.add(models("sad","This is our sad", R.drawable.sad))
        list.add(models("thinking","This is our thinking", R.drawable.thinking))
        list.add(models("disgusted","This is our disgusted", R.drawable.disgusted))


        listview.adapter=my_adapter(this, R.layout.row, list)

    }
}