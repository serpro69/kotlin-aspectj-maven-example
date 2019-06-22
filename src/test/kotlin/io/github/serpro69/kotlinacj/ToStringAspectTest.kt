package io.github.serpro69.kotlinacj

import org.junit.Test
import kotlin.test.*

class ToStringAspectTest {

    @Test
    @Throws(Exception::class)
    fun testIntToString() {
        assertEquals("42", SomethingSomething().customToString())
    }
}
