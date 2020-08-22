package kr.co.pv.dagger2demo

import dagger.Component
import dagger.Provides

@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPersonA(): PersonA

    fun inject(personB:PersonB)// 멤버 - 인잭션 메서드
}