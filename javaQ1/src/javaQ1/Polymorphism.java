package javaQ1;
//Function overloading/Method overloading/
class Std{
	String name;
	int age;
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Std s=new Std();
		s.name="Aman";
		s.age=22;
		s.printInfo(s.name);
		s.printInfo(s.age);
		s.printInfo(s.name,s.age);

	}

}
