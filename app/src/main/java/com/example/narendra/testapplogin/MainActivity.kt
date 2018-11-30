package com.example.narendra.testapplogin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.app.NotificationCompat.getExtras
import android.content.Intent



class MainActivity : AppCompatActivity() {

    private var test: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        test= findViewById(R.id.test)
        val userName:String = intent.getStringExtra("user")

        val intent = intent
        val bundle = intent.extras
        var userName1:String
        userName1 ="no name"
        // using bundle
        if (bundle != null) {
            userName1 = bundle.getString("user")
        }
        //without using bundle
            test!!.setText("Welcome to "+userName+"  bundle"+userName1)

    }

}
