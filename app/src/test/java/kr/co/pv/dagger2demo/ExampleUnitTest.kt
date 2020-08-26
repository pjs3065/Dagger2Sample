package kr.co.pv.dagger2demo
import kr.co.pv.dagger2demo.di.component.BindComponent
import kr.co.pv.dagger2demo.di.component.DaggerBindComponent
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
    fun testBindsInstance(){
        val str = "HelloWorld"
        val foo = Foo()

        val component: BindComponent = DaggerBindComponent.builder()
            .setString(str)
            .build()

        component.inject(foo)
        assertEquals(str, foo.str)
    }
}