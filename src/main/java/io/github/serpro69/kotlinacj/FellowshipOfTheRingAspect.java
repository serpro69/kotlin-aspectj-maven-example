package io.github.serpro69.kotlinacj;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FellowshipOfTheRingAspect {

    @Pointcut("execution(* io.github.serpro69.kotlinacj.FellowshipOfTheRing.getRingBearer())")
    public void decideWhoIsTakingTheRing(){
    }

    @Around("decideWhoIsTakingTheRing()")
    public Object frodo() {
        return "Frodo";
    }
}
