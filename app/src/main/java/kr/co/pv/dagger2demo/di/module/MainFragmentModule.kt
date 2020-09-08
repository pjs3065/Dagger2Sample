package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import kr.co.pv.dagger2demo.di.scope.FragmentScope
import java.util.*

@Module
class MainFragmentModule {

    @FragmentScope
    @Provides
    fun provideInt(): Int = Random().nextInt()
}