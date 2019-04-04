package com.example.chapter_solid.OpenClosePrinciple.correct

/**
 * Created by Fernando Batista on 04/04/19.
 */

class Rectangle(val height: Double, val width: Double) : Shape() {


    override fun getArea(): Double = height * width
}