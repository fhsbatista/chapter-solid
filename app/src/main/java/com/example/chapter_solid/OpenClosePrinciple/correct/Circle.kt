package com.example.chapter_solid.OpenClosePrinciple.correct

/**
 * Created by Fernando Batista on 04/04/19.
 */

class Circle(val radius: Double) : Shape() {

    override fun getArea(): Double = 3.14 * radius * radius
}