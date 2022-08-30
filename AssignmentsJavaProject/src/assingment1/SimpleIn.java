package assingment1;

public class SimpleIn {

	public SimpleIn (int P, int T, int R, String loan ) { // Constructor
		
		System.out.println("Simple Intrest of "+loan);
		System.out.println("principle amount = " + P);
		System.out.println("Time = " + T);
		System.out.println("Rate = " + R);
		int Z = ((P*T*R)/100);		
		System.out.println("Simple Intrest = " + Z);
		System.out.println();
	}
	public SimpleIn (){ 
		this(5000,8,70, "Loan 3 ");		
	}
	
	public static void main(String[] args) {
		new SimpleIn(2000,5,60, "Loan 1 "); 
		new SimpleIn(6000,3,80, "Loan 2 "); 
		new SimpleIn();
	}
}
