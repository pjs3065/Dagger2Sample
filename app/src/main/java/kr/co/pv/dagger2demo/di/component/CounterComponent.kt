package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.Counter
import kr.co.pv.dagger2demo.di.module.CounterModule

@Component(modules = [CounterModule::class])
interface CounterComponent {
    fun inject(counter: Counter)
}