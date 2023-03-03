package com.caplist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("com/caplist/config.xml");
		Question q = (Question)c.getBean("ques");
		System.out.println(q);
	}

}


