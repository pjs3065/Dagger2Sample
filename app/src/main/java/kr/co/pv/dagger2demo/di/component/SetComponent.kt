package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.Foo
import kr.co.pv.dagger2demo.di.module.SetModule

@Component(modules = [SetModule::class])
interface SetComponent {
    fun inject(foo: Foo)
}