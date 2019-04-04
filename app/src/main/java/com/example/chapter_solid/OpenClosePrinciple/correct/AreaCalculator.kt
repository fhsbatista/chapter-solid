package com.example.chapter_solid.OpenClosePrinciple.correct

/**
 * Created by Fernando Batista on 04/04/19.
 */

object AreaCalculator {


    fun getSumArea(shapes: List<Shape>): Double {
        var sumArea = 0.0

        for (shape in shapes) {
            sumArea += shape.getArea()
        }

        return sumArea
    }
}