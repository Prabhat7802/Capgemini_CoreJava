package javaQ1;
class Account{
	private String password;
	
	
	public String getPassword() {
		return  password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}

public class AcessModifiers {
     public static void main(String[] args) {
		Account a=new Account();
		a.setPassword("aman");
		System.out.println(a.getPassword());
     }}
	