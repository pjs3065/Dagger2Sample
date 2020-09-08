package kr.co.pv.dagger2demo.ui

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.pv.dagger2demo.App
import kr.co.pv.dagger2demo.R
import kr.co.pv.dagger2demo.di.component.MainActivityComponent
import kr.co.pv.dagger2demo.di.module.MainActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName: String

    lateinit var component: MainActivityComponent
        private set

    private lateinit var mainFragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //After build MainActivityComponent, inject it
        component = (application as App).appComponent
            .mainActivityComponentBuilder()
            .setModule(MainActivityModule())
            .setActivity(this)
            .build()

        component.inject(this)

        //Create fragment
        if (!::mainFragment.isInitialized || !supportFragmentManager.fragments.contains(mainFragment)) {
            mainFragment = MainFragment.newInstance()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_main_container, mainFragment)
            .commitAllowingStateLoss()
    }
}