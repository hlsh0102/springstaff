package com.crazytd.springstaff.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AudienceTwo {

    /**
     * 切点的定义
     */
    @Pointcut("execution(** com.crazytd.springstaff.aop.Performance.perform(..))")
    public void performace(){}

    @Around("performace()")
    public void watchingPerform(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("请关闭手机");
            System.out.println("请入座");
            joinPoint.proceed();
            System.out.println("鼓掌，牛批");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
