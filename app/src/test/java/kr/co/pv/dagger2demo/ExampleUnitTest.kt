package kr.co.pv.dagger2demo
import kr.co.pv.dagger2demo.di.component.DaggerMyComponent
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
    fun testSingleton(){
        val component = DaggerMyComponent.create()
        val temp1 = component.getAModel()
        val temp2 = component.getAModel()
        assertNotNull(temp1)
        assertNotNull(temp2)
        println(temp1)
        println(temp2)
    }
}