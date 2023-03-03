package com.caplist;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class listTest {

	@Test
	public void test() {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/caplist/config.xml");
		Question q = (Question)c.getBean("ques");
		assertEquals(1,q.getQuestionId());
	}
	
	
}
