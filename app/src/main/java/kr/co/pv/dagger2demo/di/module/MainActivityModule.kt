package kr.co.pv.dagger2demo.di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import kr.co.pv.dagger2demo.di.component.MainFragmentComponent
import kr.co.pv.dagger2demo.di.scope.ActivityScope
import kr.co.pv.dagger2demo.ui.MainActivity
import kr.co.pv.dagger2demo.ui.MainFragment
import javax.inject.Named

@Module(subcomponents = [MainFragmentComponent::class])
abstract class MainActivityModule {

    companion object {
        @Named("activity")
        @Provides
        @ActivityScope
        fun provideString(): String = "String from MainActivityModule"
    }

    @Binds
    @IntoMap
    @ClassKey(MainFragment::class)
    abstract fun bindInjectorFactory(factory: MainFragmentComponent.Factory)
}