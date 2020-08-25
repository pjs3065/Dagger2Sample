package kr.co.pv.dagger2demo

import kr.co.pv.dagger2demo.di.component.CounterComponent
import kr.co.pv.dagger2demo.di.component.DaggerCounterComponent
import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testProvider(){
        val component: CounterComponent = DaggerCounterComponent.create()
        val counter = Counter()
        component.inject(counter)
        counter.printProvider()
    }

}