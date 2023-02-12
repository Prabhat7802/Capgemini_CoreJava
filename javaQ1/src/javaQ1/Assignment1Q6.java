package javaQ1;
import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	if(userId.equalsIgnoreCase(user) && pass.equals(password))
    		return "Welcome " + user;
    	else
    		return ("You have enter a wrong credentials.Please enter a right credentials");
    }

}

public class Assignment1Q6 {

	public static void main(String[] args) {
		
        Scanner sc=new  Scanner(System.in);
        Login l=new Login();
        int a =0;
        while(true) {
        	if(a==3) {
        		System.out.println("You have enter wrong credentials 3 times");
        		System.out.println("Contact admin");
        		break;
        	}
        	 System.out.println("Enter a userId");
        	 String user = sc.nextLine();
        	 System.out.println("Enter a password");
        	 String pass = sc.nextLine();
        	 String res=l.loginUser(user,pass);
        	   
        	 System.out.println(res);
        	 
        	 if(res.equals("Welcome " + user)) {
        		 break;
        	 }
        	 a++;
        	 
        	
        }
        }

}
