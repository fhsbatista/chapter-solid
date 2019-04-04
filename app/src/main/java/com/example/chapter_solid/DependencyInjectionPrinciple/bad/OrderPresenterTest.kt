package com.example.chapter_solid.DependencyInjectionPrinciple.bad

import com.example.chapter_solid.SingleResponsabilityPrinciple.correct.Order
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by Fernando Batista on 04/04/19.
 */
class OrderPresenterTest {


    private lateinit var presenter: OrderPresenter

    @Before
    fun setup() {
        presenter = OrderPresenter()
    }

    @Test
    fun testSaveOrder() {

        val order = Order()

        //Imposible to test, because we have to use the original OrderRepository class instead of a mocked one.
        val isOrderSavedSuccessfully = presenter.saveOrder(order)

        //assert( ... )

    }


}