package io.github.serpro69.kotlinacj

import org.hamcrest.CoreMatchers.*
import org.joda.time.*
import org.junit.*
import org.junit.Assert.*

class SomeAspectTest {
    @Test
    @Throws(Exception::class)
    fun testDateTimeToString() {
        assertThat(DateTime().toString(), `is`(SomeAspect.TO_STRING_RESULT))
    }
}
