package com.example.chapter_solid.DependencyInjectionPrinciple.good

import com.example.chapter_solid.SingleResponsabilityPrinciple.correct.Order

/**
 * Created by Fernando Batista on 04/04/19.
 */

class OrderPresenter(val repository: OrderRepository) {

    fun saveOrder(order: Order) {
        val success = repository.saveOrder(order)
    }
}

interface OrderRepository {

    fun saveOrder(order: Order): Boolean
}

class OrderRepositoryImpl() : OrderRepository {

    override fun saveOrder(order: Order): Boolean {
        //do something
        return true
    }
}