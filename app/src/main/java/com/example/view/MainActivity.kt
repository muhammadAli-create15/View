package com.example.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val arrayList=ArrayList<Model> ()
        arrayList.add(Model("Wallet","Description about the wallet",R.drawable.wallet))
        arrayList.add(Model("Test","Description about the test",R.drawable.test))
        arrayList.add(Model("Post","Description about post",R.drawable.post))
        arrayList.add(Model("Profile","Description about the profile",R.drawable.profile))
        arrayList.add(Model("Payment","Description about the news payment",R.drawable.payment))

        val myAdapter=MyAdapter(arrayList,this)

        recycleView.layoutManager=LinearLayoutManager(this)
        recycleView.adapter=myAdapter

    }
}