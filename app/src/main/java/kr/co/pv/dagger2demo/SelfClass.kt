package kr.co.pv.dagger2demo

import javax.inject.Inject

open class SelfClass:ParentClass() {
    @Inject
    lateinit var b:BClass
}