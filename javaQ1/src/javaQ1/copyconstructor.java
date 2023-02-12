package javaQ1;

class Complex {

	double re, im;

	// paramatrized
	public Complex(double re, double im) {

		this.re = re;
		this.im = im;

	}

	// copy constructor
	Complex(Complex c) {

		System.out.println("Copy constructor called");

		re = c.re;
		im = c.im;
		System.out.println(re + " " + im);
	}

}

public class copyconstructor {

	public static void main(String[] args) {

		Complex c1 = new Complex(10, 15);

		Complex c2 = new Complex(c1);

	}
}
