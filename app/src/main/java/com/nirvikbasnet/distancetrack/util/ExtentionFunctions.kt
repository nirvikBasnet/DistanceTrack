package com.nirvikbasnet.distancetrack.util

import android.view.View
import android.widget.Button

object ExtentionFunctions {

    fun View.show(){
        visibility = View.VISIBLE
    }

    fun View.hide(){
        visibility = View.INVISIBLE
    }

    fun Button.enabled(){
        isEnabled = true
    }

    fun Button.disabled(){
        isEnabled = false
    }
}