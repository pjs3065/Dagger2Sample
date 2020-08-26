package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.di.AModel
import kr.co.pv.dagger2demo.di.module.MyModule
import kr.co.pv.dagger2demo.di.scope.UserScope

@UserScope
@Component(modules = [MyModule::class])
interface MyComponent {
    fun getAModel(): AModel
}