package kr.co.pv.dagger2demo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kr.co.pv.dagger2demo.App
import kr.co.pv.dagger2demo.R
import kr.co.pv.dagger2demo.di.component.MainActivityComponent
import kr.co.pv.dagger2demo.di.module.MainActivityModule
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    @Named("app")
    lateinit var appString: String

    @Inject
    @Named("activity")
    lateinit var activityString: String

    private lateinit var mainFragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        Log.d("MainActivity", appString)
        Log.d("MainActivity", activityString)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create fragment
        if (!::mainFragment.isInitialized || !supportFragmentManager.fragments.contains(mainFragment)) {
            mainFragment = MainFragment.newInstance()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_main_container, mainFragment)
            .commitAllowingStateLoss()
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}