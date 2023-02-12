package javaQ1;

class Shape{
	String color;
	public void nm3() {
		System.out.println(color);
	}
}
class Triangle extends Shape{
	public void nm() {
		System.out.println(color);
	}
}
class Triangle1 extends Shape{
	public void nm1() {
		nm3();
//		System.out.println(color);
//		System.out.println("Multilevel inheritance");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Triangle1 t=new Triangle1();
		t.color="black";
		t.nm1();

	}

}
