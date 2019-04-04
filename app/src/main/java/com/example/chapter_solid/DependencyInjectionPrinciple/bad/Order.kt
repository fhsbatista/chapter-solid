package com.example.chapter_solid.DependencyInjectionPrinciple.bad

import com.example.chapter_solid.SingleResponsabilityPrinciple.correct.Order

/**
 * Created by Fernando Batista on 04/04/19.
 */

class OrderPresenter() {

    val repository = OrderRepository()

    fun saveOrder(order: Order) {
        repository.saveOrder(order)
    }

}

class OrderRepository() {

    fun saveOrder(order: Order) {
        //do something
    }
}