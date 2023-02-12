package javaQ1;
import java.util.Scanner;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	String result="";
    	if((subject1Marks > 60) || subject2Marks > 60 || subject3Marks > 60
    			|| subject1Marks + subject2Marks + subject3Marks < 60  ) {
    		
    			result = "failed";
    			return result;
    		
    	}
    	
    	
    	
    	
    	if(subject1Marks + subject2Marks > 60 || subject2Marks + subject3Marks > 60  
				|| subject3Marks + subject1Marks > 60) {
    		result = ("passed"+" "+ "promoted");
    		return result;
    	}
    	result = "failed";
    	return result;
    	
    }
}

public class Assignment1Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int t = sc.nextInt();
		while(t!=0) {
		double a=sc.nextDouble();
			
		double b=sc.nextDouble();
			
		double c=sc.nextDouble();
		
		ResultDeclaration obj= new ResultDeclaration();
		System.out.println(obj.declareResults(a, b, c));
		
		t--;
		
		}	
		
}

}
