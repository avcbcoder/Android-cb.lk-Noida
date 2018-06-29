package com.av.lec8_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = listview // No need of find view by id

        var al = ArrayList<String>()
        populate(al)

        val adapter = ArrayAdapter<String>(
                this,
                R.layout.list_item,
                R.id.tv,
                al
        )

        lv.setAdapter(adapter);

        // Can be done in one line

        val textV = textview


//        // 1st method
//        var ocl = object : View.OnClickListener {
//            override fun onClick(v: View?) {
//            Log("1st")
//            }
//        }
//
//        textV.setOnClickListener(ocl)
//
//        // 2nd method
//        textV.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Log("2nd")
//            }
//        })
//
//        // 3rd Method
//        textV.setOnClickListener({ v: View -> toast("3rd Method") })

        //4th Method
        textV.setOnClickListener() {
            Log("OneLine")
        }
    }

    private fun populate(al: ArrayList<String>) {
        al.add("f1")
        al.add("f2")
        al.add("f3")
        al.add("f4")
        al.add("f5")
        al.add("f7")
        al.add("f8")
        al.add("f9")
        al.add("f10")
        al.add("f11")
        al.add("f12")
        al.add("f13")
    }

    fun Log(s: String): Unit {
        Log.e("Clicked : ", s)
    }
}
