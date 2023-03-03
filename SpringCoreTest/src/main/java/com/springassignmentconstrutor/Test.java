package com.springassignmentconstrutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springassignmentconstrutor/aaconfig.xml");

		Customer customer1 = context.getBean("customer", Customer.class);
		System.out.println(customer1);
	}

}
