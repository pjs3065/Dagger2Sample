package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides

@Module
class HelloModule {

    @Provides
    fun provideString():String = "Hello"
}