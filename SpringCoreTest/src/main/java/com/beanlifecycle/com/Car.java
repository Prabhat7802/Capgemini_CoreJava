package com.beanlifecycle.com;

public class Car {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	public void init() {
		System.out.println("Init method call");

	}

	public void destroy() {
		System.out.println("Destroy method call");
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
}
