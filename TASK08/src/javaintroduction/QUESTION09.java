package javaintroduction;

import java.util.Scanner;

public class QUESTION09 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		
		if (age>=60) {
			System.out.println("You are a senior citizen");
		}
		else  {
			System.out.println("You are not a senior citizen yet");
		}
		
		

	}

}
