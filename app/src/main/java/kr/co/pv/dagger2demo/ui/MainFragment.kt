package kr.co.pv.dagger2demo.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import kr.co.pv.dagger2demo.R
import javax.inject.Inject
import javax.inject.Named

class MainFragment : Fragment(), HasAndroidInjector {

    @Inject
    @Named("app")
    lateinit var appString: String

    @Inject
    @Named("activity")
    lateinit var activityString: String

    @Inject
    @Named("fragment")
    lateinit var fragmentString: String

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        Log.d("MainFragment", appString)
        Log.d("MainFragment", activityString)
        Log.d("MainFragment", fragmentString)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}