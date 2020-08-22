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
        val myComponent:MyComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)
        assertEquals("Hello World", myClass.str) //str == hello world
    }

    @Test fun testMemberInjector(){
        val myClass = MyClass()
        val myComponent:MyComponent = DaggerMyComponent.create()
        myComponent.getInjector().injectMembers(myClass)
        assertEquals("Hello World", myClass.str) //str == hello world
    }

    @Test fun testInjection(){
        val personComponent:PersonComponent = DaggerPersonComponent.create()
        val personA = personComponent.getPersonA()
        println("personA's Name : ${personA.name}, personA's Age : ${personA.age}")

        val personB = PersonB()
        personComponent.inject(personB)

        assertEquals("Charles", personB.name)
        assertEquals(28, personB.getAge())
    }
}