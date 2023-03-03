package com.Q6assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q6Test {

	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Q6assignment/bankconfig.xml");
		Bank b=context.getBean("bank1",Bank.class);
		assertEquals("Saving",b.getAccountType());
	}

}
