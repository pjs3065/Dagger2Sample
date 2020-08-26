package kr.co.pv.dagger2demo
import kr.co.pv.dagger2demo.di.component.DaggerStrComponent
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
    fun testFoo(){
        val foo = Foo()

        DaggerStrComponent.create().inject(foo)
        println(foo.str.isPresent)
        println(foo.str.get())

        //오류가 나는데 왜 나는지 모르겠다.
//        DaggerNoStrComponent.create().inject(foo)
//        println(foo.str2.isPresent)
//        println(foo.str.get())
    }
}