package com.capAss.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("com/capAss/com/config.xml");
		Question q = (Question)c.getBean("ques");
		System.out.println(q);
	}

}


