package com.springassignment;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springassignment/Q1config.xml");
		Customer customer1 = (Customer) context.getBean("customer");
		// Customer customer1=new Customer();
		assertEquals("John", customer1.getCustomerName());
		
	}
	
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springassignment/Q1config.xml");
		Customer customer1 = (Customer) context.getBean("customer");
	
		
		assertEquals(101,customer1.getCustomerId() );
	}

}
