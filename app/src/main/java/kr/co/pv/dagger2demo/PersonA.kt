package kr.co.pv.dagger2demo

import javax.inject.Inject

//생성자에 주입
class PersonA @Inject constructor(val name: String, val age: Int)