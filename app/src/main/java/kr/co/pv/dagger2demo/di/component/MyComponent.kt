package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.di.AModel
import kr.co.pv.dagger2demo.di.module.MyModule
import javax.inject.Singleton

@Singleton
@Component(modules = [MyModule::class])
interface MyComponent {
    fun getAModel(): AModel
}