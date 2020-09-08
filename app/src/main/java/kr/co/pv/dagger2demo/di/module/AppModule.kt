package kr.co.pv.dagger2demo.di.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import kr.co.pv.dagger2demo.App
import kr.co.pv.dagger2demo.di.component.MainActivityComponent
import kr.co.pv.dagger2demo.ui.MainActivity
import javax.inject.Named
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
abstract class AppModule {

    companion object {
        @Named("app")
        @Provides
        @Singleton
        fun provideString() = "String from AppModule"
    }

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjectorFactory(factory: MainActivityComponent.Factory)
}