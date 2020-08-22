package kr.co.pv.dagger2demo

import androidx.annotation.Nullable
import dagger.Component
import dagger.MembersInjector
import java.lang.reflect.Member

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString():String //프로비전 메서드, 바인드된 모듈로부터 의존성 제공
    fun inject(myClass: MyClass) //멤버 인잭션 메서드를 사용하는 방법
    fun getInjector(): MembersInjector<MyClass> //MembersInjector를 사용하는 방법
}