package com.example.chapter_solid.SingleResponsabilityPrinciple.incorrect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter_solid.R
import com.example.chapter_solid.SingleResponsabilityPrinciple.correct.Order

class GodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_god)

        val order = Order()

        //Show the total value of the order using a toast
        Toast.makeText(this, getOrderTotalValue(order).toString(), Toast.LENGTH_LONG).show()

        //Persist the order in database
        saveOrder(order)

        //Print the order in a paper
        printOrder(order)
    }

    private fun getOrderTotalValue(order: Order) {
        //Logic to calculte order total value
    }

    private fun saveOrder(order: Order) {
        //Logic to persist the order in database
    }

    private fun printOrder(order: Order) {
        //Logic to print the order in a paper
    }



}

class Order() {

}
