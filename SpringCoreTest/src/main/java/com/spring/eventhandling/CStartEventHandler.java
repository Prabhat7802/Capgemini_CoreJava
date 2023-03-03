package com.spring.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");

	}

}

/*
 * You have seen in all the chapters that the core of Spring is the
 * ApplicationContext, which manages the complete life cycle of the beans. The
 * ApplicationContext publishes certain types of events when loading the
 * beans.For example, a ContextStartedEvent is published when the context is
 * started and ContextStoppedEvent is published when the context is stopped.
 * 
 * 
 * Event handling in the ApplicationContext is provided through the
 * ApplicationEvent class and ApplicationListener interface. Hence, if a bean
 * implements the ApplicationListener, then every time an ApplicationEvent gets
 * published to the ApplicationContext, that bean is notified.
 */