package io.github.serpro69.kotlinacj

import org.aspectj.lang.*
import org.aspectj.lang.annotation.*

@Aspect
class SomeAspect {

    @Pointcut("execution(* org.joda.time.base.AbstractDateTime.toString())")
    fun dateTimeToString() {
    }

    @Around("dateTimeToString()")
    @Throws(Throwable::class)
    fun toLowerCase(joinPoint: ProceedingJoinPoint): Any {
        val ignoredToStringResult = joinPoint.proceed()
        println("SOME LOG MESSAGE")
        return TO_STRING_RESULT
    }

    companion object {

        val TO_STRING_RESULT = "test"
    }
}
