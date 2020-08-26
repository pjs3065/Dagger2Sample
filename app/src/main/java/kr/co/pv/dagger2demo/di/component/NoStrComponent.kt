package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.Foo
import kr.co.pv.dagger2demo.di.module.CommonModule

@Component(modules = [CommonModule::class])
interface NoStrComponent {
    fun inject(foo: Foo)
}