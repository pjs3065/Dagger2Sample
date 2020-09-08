package kr.co.pv.dagger2demo.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kr.co.pv.dagger2demo.R
import kr.co.pv.dagger2demo.di.component.MainFragmentComponent
import kr.co.pv.dagger2demo.di.module.MainFragmentModule
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName: String

    @JvmField
    @Inject
    var randomInt: Int = 0

    lateinit var component: MainFragmentComponent

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component = (activity as MainActivity).component.mainFragmentComponentBuilder()
            .setModule(MainFragmentModule())
            .setFragment(this@MainFragment)
            .build()

        component.inject(this@MainFragment)

        Log.d("daggerTest","name : $activityName number: $randomInt")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)
}