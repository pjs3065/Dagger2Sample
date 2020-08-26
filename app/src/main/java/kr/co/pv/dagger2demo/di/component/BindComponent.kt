package kr.co.pv.dagger2demo.di.component

import dagger.BindsInstance
import dagger.Component
import kr.co.pv.dagger2demo.Foo

@Component
interface BindComponent {
    fun inject(foo: Foo)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun setString(str:String): Builder
        fun build():BindComponent
    }
}