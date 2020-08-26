package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class SetModule {
    @Provides
    @IntoSet
    fun provideHello() =  "Hello"

    @Provides
    @IntoSet
    fun provideWorld() =  "World"

    @Provides
    @ElementsIntoSet
    fun provideSet():Set<String> = HashSet(arrayListOf("Charles","Runa"))
}