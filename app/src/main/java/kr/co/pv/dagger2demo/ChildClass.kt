package kr.co.pv.dagger2demo

import javax.inject.Inject

class ChildClass: SelfClass() {
    @Inject
    lateinit var c:CClass
}