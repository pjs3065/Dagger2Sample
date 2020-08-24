package kr.co.pv.dagger2demo.di.component

import dagger.BindsInstance
import dagger.Component
import kr.co.pv.dagger2demo.Foo
import kr.co.pv.dagger2demo.MyWidget
import kr.co.pv.dagger2demo.di.module.BackendModule
import kr.co.pv.dagger2demo.di.module.FrontendModule

@Component(modules = [BackendModule::class, FrontendModule::class])
interface MyComponent {
    fun myWidget(): MyWidget

    @Component.Builder
    interface Builder {
        //세터 메서드는 반드시 하나의 매개변수만 가져야하고, 반환형으로 void, 빌더, 또는 빌더의 슈퍼 타입
        fun backendModule(bm: BackendModule): Builder
        fun frontendModule(fm: FrontendModule): Builder

        @BindsInstance
        fun foo(foo: Foo)
        fun build(): MyComponent
    }
}