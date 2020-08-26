package kr.co.pv.dagger2demo.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import kr.co.pv.dagger2demo.key.Animal
import kr.co.pv.dagger2demo.key.AnimalKey
import kr.co.pv.dagger2demo.key.NumberKey

@Module
class MapKeyModule {
    @Provides
    @IntoMap
    @AnimalKey(Animal.CAT)
    fun provideCat() = "CAT"

    @Provides
    @IntoMap
    @AnimalKey(Animal.DOG)
    fun provideDog() = "DOG"

    @Provides
    @IntoMap
    @NumberKey(Float::class)
    fun provideFloatValue():String = "100f"

    @Provides
    @IntoMap
    @NumberKey(Int::class)
    fun provideIntValue():String = "1"
}