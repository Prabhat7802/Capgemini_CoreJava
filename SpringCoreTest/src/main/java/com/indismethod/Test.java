package com.indismethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/indismethod/beanconfig.xml");
        context.registerShutdownHook();
		 Coffee e=context.getBean("coffee1",Coffee.class);
		 System.out.println(e);
	}

}
