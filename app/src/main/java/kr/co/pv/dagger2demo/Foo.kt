package kr.co.pv.dagger2demo

import javax.inject.Inject

class Foo {

    @Inject
    lateinit var map1:Map<String,Long>

    @Inject
    lateinit var map2:Map<Class<*>,String>

    fun print(){
        val long1 = map1["foo"]
        val str1 = map2[Foo()::class.java]
        println("long1 : $long1")
        println("str1 : $str1")
    }
}