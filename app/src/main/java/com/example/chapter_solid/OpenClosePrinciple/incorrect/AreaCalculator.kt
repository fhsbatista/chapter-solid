package com.example.chapter_solid.OpenClosePrinciple.incorrect

import java.lang.IllegalArgumentException

/**
 * Created by Fernando Batista on 04/04/19.
 */

object AreaCalculator {

    fun getSumArea(shapes: List<Shape>): Double {

        var sumArea: Double = 0.0

        for (shape in shapes) {

            if (shape is Rectangle) {
                sumArea += (shape as Rectangle).height * (shape as Rectangle).width
            } else if (shape is Circle) {
                val radius = (shape as Circle).radius
                sumArea += (radius * radius) * 3.14
            } else {
                throw IllegalArgumentException("Invalid shape")
            }
        }

        return sumArea

    }

}