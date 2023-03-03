package com.questionset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext co=new ClassPathXmlApplicationContext("com/questionset/Setconfig.xml");

Question object1=co.getBean("set",Question.class);
System.out.println(object1);
	}

}
