package io.github.serpro69.kotlinacj

import org.aspectj.lang.*
import org.aspectj.lang.annotation.*

@Aspect
class ToStringAspect {

    @Suppress("unused")
    @Pointcut("execution(* io.github.serpro69.kotlinacj..*.customToString())")
    fun anyToString() {
    }

    @Suppress("unused")
    @Around("anyToString()")
    @Throws(Throwable::class)
    fun to42(joinPoint: ProceedingJoinPoint): Any = "42"
}
