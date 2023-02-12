package javaQ1;

class ArmstrongOrNot{
	public boolean armstrongCheck(int num) {
		int Num= num;
		int r,sum=0;
		while(Num!=0) {
			r = Num % 10;
			int ans = r * r * r;
			sum= sum + ans;
			Num= Num/10;
		}
		if(sum == num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Armstrong1Q1{

	public static void main(String[] args) {

    ArmstrongOrNot a= new ArmstrongOrNot();
    System.out.println(a.armstrongCheck(153));

	}

}
