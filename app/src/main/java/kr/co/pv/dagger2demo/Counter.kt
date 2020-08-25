package kr.co.pv.dagger2demo

import javax.inject.Inject
import javax.inject.Provider

class Counter {

    @Inject
    lateinit var provider: Provider<Int>

    fun printProvider(){
        println("printing...")
        println("${provider.get()}")
        println("${provider.get()}")
        println("${provider.get()}")
    }
}