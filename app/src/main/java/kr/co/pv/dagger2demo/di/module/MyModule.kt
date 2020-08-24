package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.AClass
import kr.co.pv.dagger2demo.BClass
import kr.co.pv.dagger2demo.CClass

@Module
class MyModule {
    @Provides
    fun provideHelloWorld():String = "Hello World"

    @Provides
    fun provideA(): AClass = AClass()

    @Provides
    fun provideB(): BClass = BClass()

    @Provides
    fun provideC(): CClass = CClass()
}