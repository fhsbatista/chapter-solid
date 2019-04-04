package com.example.chapter_solid.SRP.incorrect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter_solid.R
import com.example.chapter_solid.SRP.correct.Order

class GodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_god)
    }

    private fun getOrderTotalValue(order: Order) {
        //Logic to calculte order total value
    }

    private fun saveOrder(order: Order) {
        //Logic to persist the order
    }

    private fun printOrder(order: Order) {
        //Logic to print the order
    }



}
