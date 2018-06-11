package com.crazytd.springstaff.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    /**
     * 切点的定义
     */
    @Pointcut("execution(** com.crazytd.springstaff.aop.Performance.perform(..))")
    public void performace(){}


    /**
     * 前置通知的定义，表演之前
     */
    @Before("performace()")
    public void silenceCellPhone(){
        System.out.println("silence the cell phone");
    }

    /**
     * 前置通知的定义，表演之前
     */
    @Before("performace()")
    public void takeSeat(){
        System.out.println("take a seat");
    }


    /**
     * 前置通知的定义，表演之后
     */
    @AfterReturning("performace()")
    public void applause(){
        System.out.println("such a grate perform");
    }

    /**
     * 出现意外的时候
     */
    @AfterThrowing("performace()")
    public void demandRefund(){
        System.out.println("demand a refund");
    }
}
