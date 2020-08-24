package kr.co.pv.dagger2demo

import dagger.Lazy
import javax.inject.Inject

class Counter {

    @Inject
    lateinit var lazy: Lazy<Int>

    fun printLazy(){
        println("printing...")
        println("${lazy.get()}")
        println("${lazy.get()}")
        println("${lazy.get()}")
    }
}