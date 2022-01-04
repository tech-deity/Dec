package com.example.dec

import androidx.lifecycle.ViewModel

class MainViewModel(val initalval:Int) :ViewModel(){


    var count :Int =initalval
    fun increment(){
        count++
    }

}