package kr.co.pv.dagger2demo

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

    @Test fun testMemberInjection(){
        val myClass = MyClass()
        var name = myClass.name
        assertNotNull("조회 결과 null", name) // 널이 아님을 확인

        val myComponent:MyComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)
        name = myClass.name
        assertEquals("Charles", name) //str == hello world
    }
}