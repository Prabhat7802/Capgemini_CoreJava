package com.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springassignment/Q1config.xml");
		
		Customer customer1 =context.getBean("customer",Customer.class);
		Customer customer2 =context.getBean("customer1",Customer.class);
		System.out.println(customer1);
		System.out.println(customer2);
	}

	

}
