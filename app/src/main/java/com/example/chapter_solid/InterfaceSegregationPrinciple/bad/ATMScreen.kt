package com.example.chapter_solid.InterfaceSegregationPrinciple.bad

/**
 * Created by Fernando Batista on 04/04/19.
 */

class ATMScreen : ScreenBehavior {

    override fun onScreenClick() {
        //do something
    }

    //This class should not implement this method
    override fun onScreenDragged() {
        throw Exception("Gesture not supported")
    }
}