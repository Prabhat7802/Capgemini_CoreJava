package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy
@Aspect
public class MyAspect {
	
 @Before("execution(* com.aop.services.PaymentServiceImp.makePayment())")
 public void printBefore()
 {
  System.out.println("Payment started...");
 }
	
 @After("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
 public void printAfter()
 {
  System.out.println("Payment done...");
 }

}