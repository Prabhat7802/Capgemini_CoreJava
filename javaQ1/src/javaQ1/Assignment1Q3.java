package javaQ1;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double simpleinterest=(principalAmount * interestRate * time)/100;
    	return simpleinterest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double compoundinterest= principalAmount * (Math.pow((1 + interestRate/100),time))-principalAmount;
    	return compoundinterest;
    }
}

public class Assignment1Q3 {
	public static  void main(String[] args) {
		SiCi s=new SiCi();
		
		System.out.println(s.simpleInterest(1000,6, 12.5)+ " is a simple interest");
		System.out.println(s.simpleInterest(1000.12,5, 12.5)+ " is a compound interest");
		
	}

}
