package PracticeofScanner;

import java.util.Scanner;


public class TableOf5 {

	public void m1() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter no :");
		int a = s1.nextInt();
		System.out.println( "table of 5");
		for (int i=1; i<=10; i++) {
		System.out.println(i*a);
		}
	}
	
	public static void main(String[] args) {
		TableOf5 objOf5 = new TableOf5();
		objOf5.m1();
	}
}
