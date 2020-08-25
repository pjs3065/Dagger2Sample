package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.MyClass
import kr.co.pv.dagger2demo.di.module.MyModule

@Component(modules = [MyModule::class])
interface MyComponent {
    fun inject(myClass:MyClass)
}