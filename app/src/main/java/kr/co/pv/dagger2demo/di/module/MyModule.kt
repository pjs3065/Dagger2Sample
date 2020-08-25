package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.di.annotation.Hello
import kr.co.pv.dagger2demo.di.annotation.World

@Module
class MyModule {
    @Provides
    @Hello
    fun provideHello() = "Hello"

    @Provides
    @World
    fun provideWorld() = "World"
}