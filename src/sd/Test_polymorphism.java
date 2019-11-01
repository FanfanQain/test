package sd;
class calculating {
	static int calculate(int a, int b) {
		return a*b;
	}
	static int calculate(int a, int b,int c) {
		return a*b*c;
	}
	static double calculate(double a,double b) {
		return a*b;
		}

}
public class Test_polymorphism {
	public static void main(String args[]) {
	System.out.println("The result is: \n"+calculating.calculate(3,7));	
	System.out.println("The result is: \n"+calculating.calculate(3,7,10));
	System.out.println("The result is: \n"+calculating.calculate(3.3,7.7));
	}
}
