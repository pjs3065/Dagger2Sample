package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.di.module.MapKeyModule
import kr.co.pv.dagger2demo.key.Animal

@Component(modules = [MapKeyModule::class])
interface MapKeyComponent {
    fun getStringByAnimal():Map<Animal, String>
    fun getStringsByNumber():Map<Class<out Number>, String>
}