package kr.co.pv.dagger2demo.di.component

import dagger.BindsInstance
import dagger.Subcomponent
import kr.co.pv.dagger2demo.di.module.MainFragmentModule
import kr.co.pv.dagger2demo.di.scope.FragmentScope
import kr.co.pv.dagger2demo.ui.MainFragment

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentComponent {
    fun inject(fragment:MainFragment)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: MainFragmentModule): Builder

        @BindsInstance
        fun setFragment(fragment: MainFragment): Builder
        fun build(): MainFragmentComponent
    }
}