package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.Foo
import kr.co.pv.dagger2demo.di.module.MapModule

@Component(modules = [MapModule::class])
interface MapComponent {
    fun inject(foo: Foo)
}