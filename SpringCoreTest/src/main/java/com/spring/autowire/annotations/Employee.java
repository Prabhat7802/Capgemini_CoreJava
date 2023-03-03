package com.spring.autowire.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	// This annotation is used to inject the dependency automatically.
	@Autowired
	
	//@Resource

	//@Qualifier("address1")

	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting value");

		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	
	@PreDestroy
	//@PostConstruct
	public void destroy() {
		System.out.println("destroy method");
	}
	
}
