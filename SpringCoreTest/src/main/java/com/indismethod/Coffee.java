package com.indismethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coffee implements InitializingBean,DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Coffee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Coffee [price=" + price + "]";
}


@PostConstruct
public void afterPropertiesSet() throws Exception {
	System.out.println("Taking coffee");
	
}

@PreDestroy
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Going to put cup back to shop");
	
}
}
