package com.spring.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/annotations/autoconfig.xml");

		 Employee emp1=(Employee) context.getBean("employee");
		 System.out.println(emp1);
	}

}
