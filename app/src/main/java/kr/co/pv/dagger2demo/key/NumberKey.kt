package kr.co.pv.dagger2demo.key

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class NumberKey(val value: KClass<out Number>)