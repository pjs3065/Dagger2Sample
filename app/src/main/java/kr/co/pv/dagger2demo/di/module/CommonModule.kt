package kr.co.pv.dagger2demo.di.module

import dagger.BindsOptionalOf
import dagger.Module
import kr.co.pv.dagger2demo.Foo

@Module
abstract class CommonModule {
    @BindsOptionalOf
    abstract fun bindOptionalOfString(): String
}