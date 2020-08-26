package kr.co.pv.dagger2demo

import javax.inject.Inject

class Foo {

    @Inject lateinit var str:Set<String>

    fun print(){
        str.forEach {
            println(it)
        }
    }
}