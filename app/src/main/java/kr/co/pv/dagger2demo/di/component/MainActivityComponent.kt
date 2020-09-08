package kr.co.pv.dagger2demo.di.component

import dagger.BindsInstance
import dagger.Subcomponent
import kr.co.pv.dagger2demo.di.module.MainActivityModule
import kr.co.pv.dagger2demo.di.scope.ActivityScope
import kr.co.pv.dagger2demo.ui.MainActivity

@ActivityScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent {
    fun mainFragmentComponentBuilder():MainFragmentComponent.Builder
    fun inject(activity:MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(mainActivityModule: MainActivityModule):Builder

        @BindsInstance
        fun setActivity(activity: MainActivity):Builder
        fun build(): MainActivityComponent
    }
}