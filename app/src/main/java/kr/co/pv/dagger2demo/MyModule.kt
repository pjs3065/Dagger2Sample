package kr.co.pv.dagger2demo

import androidx.annotation.Nullable
import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun provideHelloWorld():String = "Hello World"
}