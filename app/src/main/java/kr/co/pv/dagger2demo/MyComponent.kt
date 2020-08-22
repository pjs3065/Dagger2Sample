package kr.co.pv.dagger2demo

import androidx.annotation.Nullable
import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString():String //프로비전 메서드, 바인드된 모듈로부터 의존성 제공
    fun inject(myClass: MyClass)
}