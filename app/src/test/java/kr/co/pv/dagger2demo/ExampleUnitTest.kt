package kr.co.pv.dagger2demo
import kr.co.pv.dagger2demo.di.component.DaggerMapComponent
import kr.co.pv.dagger2demo.di.component.MapComponent
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
    fun testMultiBindingMap(){
        val foo = Foo()
        val component: MapComponent = DaggerMapComponent.create()

        val str1 = component.getLongByString()["foo"]
        val str2 = component.getStringByClass()[foo::class.java]

        println("str1 : $str1")
        println("str2 : $str2")
    }
}