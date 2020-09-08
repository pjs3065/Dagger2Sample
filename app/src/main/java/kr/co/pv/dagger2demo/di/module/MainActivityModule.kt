package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.di.component.MainFragmentComponent
import kr.co.pv.dagger2demo.di.scope.ActivityScope
import kr.co.pv.dagger2demo.ui.MainActivity

@Module(subcomponents = [MainFragmentComponent::class])
class MainActivityModule {

    @ActivityScope
    @Provides
    fun provideActivityName():String = MainActivity::class.java.simpleName
}