package io.github.serpro69.kotlinacj

import org.aspectj.lang.*
import org.aspectj.lang.annotation.*

@Aspect
class DeepThoughtAspect {

    @Suppress("unused")
    @Pointcut("execution(* io.github.serpro69.kotlinacj.DeepThought.*())")
    fun deepThought() {
    }

    @Suppress("unused")
    @Around("deepThought()")
    fun answer(joinPoint: ProceedingJoinPoint): Any = "42"
}
