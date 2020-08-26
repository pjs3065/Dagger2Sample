package kr.co.pv.dagger2demo

import java.util.*
import javax.inject.Inject
import javax.inject.Provider

class Foo {

    @Inject lateinit var str: Optional<String>

//    @Inject lateinit var str2: Optional<Provider<String>>
//
//    @Inject lateinit var str3: Optional<Lazy<String>>
}