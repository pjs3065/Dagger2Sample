package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.di.scope.FragmentScope
import javax.inject.Named

@Module
class MainFragmentModule {

    @Named("fragment")
    @Provides
    @FragmentScope
    fun provideString(): String = "String from fragment"
}