package kr.co.pv.dagger2demo

import javax.inject.Inject

class PersonB{
    //필드 주입
    @Inject
    lateinit var name:String

    private var age: Int = 0

    //메서드 주입
    @Inject
    fun setAge(age:Int){
        this.age = age
    }

    fun getAge() = this.age
}