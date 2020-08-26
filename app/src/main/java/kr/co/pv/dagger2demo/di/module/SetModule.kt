package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class SetModule {
    @Provides
    @IntoSet
    fun provideHello() =  "Hello"

    @Provides
    @IntoSet
    fun provideWorld() =  "World"
}