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

    @Component.Factory
    interface Builder {
        //팩토리 메소드는 어노테이션에 선언된 속성들을 매개변수로 가지며,
        // BindInstance 어노테이션 선언된 배개변수는 인스턴스를 넘겨 바인딩한다.
        fun newInstance(bm:BackendModule, fm:FrontendModule, @BindsInstance foo:Foo):MyComponent
    }
}