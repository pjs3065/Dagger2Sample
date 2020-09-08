package kr.co.pv.dagger2demo.di.component

import dagger.Subcomponent
import dagger.android.AndroidInjector
import kr.co.pv.dagger2demo.di.module.MainFragmentModule
import kr.co.pv.dagger2demo.di.scope.FragmentScope
import kr.co.pv.dagger2demo.ui.MainFragment

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentComponent : AndroidInjector<MainFragment> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainFragment>
}