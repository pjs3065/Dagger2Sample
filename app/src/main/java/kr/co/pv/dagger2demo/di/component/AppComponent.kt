package kr.co.pv.dagger2demo.di.component

import dagger.BindsInstance
import dagger.Component
import kr.co.pv.dagger2demo.App
import kr.co.pv.dagger2demo.di.module.AppModule
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun mainActivityComponentBuilder(): MainActivityComponent.Builder
    fun inject(app: App)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: App,
            appModule: AppModule
        ): AppComponent
    }
}