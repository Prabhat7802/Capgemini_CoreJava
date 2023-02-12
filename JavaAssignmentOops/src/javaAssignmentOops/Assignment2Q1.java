package javaAssignmentOops;
class SingletonCheck {
	   private static SingletonCheck Obj;

	   private SingletonCheck() {      
	   }

	   public static SingletonCheck getInstance() {

	      // create object if it's not already created
	      if(Obj == null) {
	         Obj = new SingletonCheck();
	      }

	       // returns the singleton object
	       return Obj;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}

	class Assignment2Q1 {
	   public static void main(String[] args) {
		   SingletonCheck db1;

	      // refers to the only object of Database
	      db1= SingletonCheck.getInstance();
	      
	      db1.getConnection();
	   }
	}

