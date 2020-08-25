package kr.co.pv.dagger2demo

import kr.co.pv.dagger2demo.di.annotation.Hello
import kr.co.pv.dagger2demo.di.annotation.World
import javax.inject.Inject
import javax.inject.Named

class MyClass {
    @Inject
    @Hello
    lateinit var hello:String

    @Inject
    @World
    lateinit var world:String
}