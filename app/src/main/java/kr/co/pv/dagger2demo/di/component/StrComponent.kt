package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.Foo
import kr.co.pv.dagger2demo.di.module.CommonModule
import kr.co.pv.dagger2demo.di.module.HelloModule

@Component(modules = [CommonModule::class, HelloModule::class])
interface StrComponent {
    fun inject(foo: Foo)
}