package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import kr.co.pv.dagger2demo.Foo

@Module
class MapModule {
    companion object{
        @Provides
        @IntoMap
        @StringKey("foo")
        fun provideFooValue():Long = 100L

        @Provides
        @IntoMap
        @ClassKey(Foo::class)
        fun provideFooStr():String = "Foo String"
    }
}