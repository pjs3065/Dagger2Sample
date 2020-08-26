package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.di.AModel
import kr.co.pv.dagger2demo.di.scope.UserScope

@Module
class MyModule {
    @Provides
    @UserScope
    fun provideAModel() = AModel()
}