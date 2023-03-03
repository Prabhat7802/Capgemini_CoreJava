package com.beanlifecycle.com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/beanlifecycle/com/lifecycleconfig.xml");
		Car c=(Car) context.getBean("car1");
		System.out.println(c);
		
		context.registerShutdownHook();

	}

}
