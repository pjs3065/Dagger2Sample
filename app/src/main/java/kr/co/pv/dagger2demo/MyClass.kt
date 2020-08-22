package kr.co.pv.dagger2demo

import androidx.annotation.Nullable
import javax.inject.Inject

class MyClass {
    @Inject
    lateinit var str:String
}

fun main() {
    val myClass = MyClass()
    val myComponent:MyComponent = DaggerMyComponent.create()
    myComponent.inject(myClass)
    println("str : ${myClass.str}")
}