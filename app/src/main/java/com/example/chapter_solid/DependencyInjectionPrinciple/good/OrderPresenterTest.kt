package com.example.chapter_solid.DependencyInjectionPrinciple.good

import com.example.chapter_solid.SingleResponsabilityPrinciple.correct.Order
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by Fernando Batista on 04/04/19.
 */
class OrderPresenterTest {

    private lateinit var repository: OrderRepository
    private lateinit var presenter: OrderPresenter

    @Before
    fun setup() {
        repository = OrderRepositoryTest()
        presenter = OrderPresenter(repository)
    }

    @org.junit.Test
    fun saveOrder() {
        val order = Order()

        val isOrderSavedSuccessfully = presenter.saveOrder(order)

        //assert( ... )
    }
}

class OrderRepositoryTest : OrderRepository {
    override fun saveOrder(order: Order): Boolean {
        //return a successfull result
        return true
    }
}