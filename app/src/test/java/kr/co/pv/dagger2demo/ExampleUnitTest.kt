package kr.co.pv.dagger2demo
import kr.co.pv.dagger2demo.di.component.DaggerMapKeyComponent
import kr.co.pv.dagger2demo.di.component.MapKeyComponent
import kr.co.pv.dagger2demo.key.Animal
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
       val component : MapKeyComponent = DaggerMapKeyComponent.create()
        val cat = component.getStringByAnimal()[Animal.CAT]
        val dog = component.getStringByAnimal()[Animal.DOG]

        val number = component.getStringsByNumber()[Float::class.java]

        println(cat)
        println(dog)
        println(number)
    }
}