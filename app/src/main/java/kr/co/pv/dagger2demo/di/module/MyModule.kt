package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.di.AModel
import javax.inject.Singleton

@Module
class MyModule {
    @Provides
    @Singleton
    fun provideAModel() = AModel()
}