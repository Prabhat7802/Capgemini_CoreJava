package com.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/aop/asconfig.xml");

		
		PaymentService obj=context.getBean("payment",PaymentService.class);
		
		//print:payment started
		obj.makePayment();
	}

}
