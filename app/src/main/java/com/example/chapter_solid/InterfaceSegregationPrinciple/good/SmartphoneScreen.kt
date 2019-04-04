package com.example.chapter_solid.InterfaceSegregationPrinciple.good

/**
 * Created by Fernando Batista on 04/04/19.
 */

class SmartphoneScreen : SmartphoneScreenBehavior {

    override fun onScreenDragged() {
        //do something
    }

    override fun onScreenClicked() {
        //do something
    }
}