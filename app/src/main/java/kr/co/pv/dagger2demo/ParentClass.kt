package kr.co.pv.dagger2demo

import javax.inject.Inject

open class ParentClass {
    @Inject lateinit var a:AClass
}