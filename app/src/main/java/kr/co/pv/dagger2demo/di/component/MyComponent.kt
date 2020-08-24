package kr.co.pv.dagger2demo.di.component

import dagger.Component
import kr.co.pv.dagger2demo.SelfClass
import kr.co.pv.dagger2demo.di.module.MyModule

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString():String //프로비전 메서드, 바인드된 모듈로부터 의존성 제공
    fun inject(selfClass: SelfClass) //멤버 인젝션 메소드의 파라미터값 이상부터 주입이 시작
}