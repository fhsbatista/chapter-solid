package com.example.chapter_solid.SRP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter_solid.R

class SRPActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_srp)

        val order = Order()

        //Show the total value of the order using a toast
        Toast.makeText(this, order.getTotalValue().toString(), Toast.LENGTH_LONG).show()

        //Persist the order in database
        OrderDAO.saveOrder(order)

        //Print the order in a paper
        PrintOrderHelper.printOrder(order)


    }
}
