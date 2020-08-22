package kr.co.pv.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class PersonModule {

    @Provides
    fun provideName():String = "Charles"

    @Provides
    fun provideAge():Int = 28
}