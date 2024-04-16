package javaintroduction;

import java.util.Scanner;

public class QUESTION01 {

	public static void main(String[] args) {
	
		Scanner demo = new Scanner(System.in);
		
		System.out.println("Enter the value of A:");
		int A = demo.nextInt();
		
		System.out.println("Enter the value of B:");
		int B = demo.nextInt();
		
		System.out.println("Enter the value of C:");
		int C = demo.nextInt();
		
		System.out.println("Enter the value of D:");
		int D = demo.nextInt();
		
		int sum1 = A+B;
		int sum2 = C+D;
		
		if (sum1>sum2) {
			System.out.println("The sum of A and B is greater than the sum of C and D");
		}
		else {
			System.out.println("The sum of C and D is greater than the sum of A and B");
		}
	}

}
