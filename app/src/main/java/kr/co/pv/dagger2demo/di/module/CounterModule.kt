package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides

@Module
class CounterModule {
    var next = 100

    @Provides
    fun provideInt():Int{
        println("computing")
        return next++
    }
}