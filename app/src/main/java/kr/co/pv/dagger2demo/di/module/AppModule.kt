package kr.co.pv.dagger2demo.di.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.App
import kr.co.pv.dagger2demo.di.component.MainActivityComponent
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(app: App): SharedPreferences =
        app.getSharedPreferences(
            "default",
            Context.MODE_PRIVATE
        )
}