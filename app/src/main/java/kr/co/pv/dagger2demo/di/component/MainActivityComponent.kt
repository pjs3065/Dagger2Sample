package kr.co.pv.dagger2demo.di.component

import dagger.Subcomponent
import dagger.android.AndroidInjector
import kr.co.pv.dagger2demo.di.module.MainActivityModule
import kr.co.pv.dagger2demo.di.scope.ActivityScope
import kr.co.pv.dagger2demo.ui.MainActivity

@ActivityScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainActivity>
}