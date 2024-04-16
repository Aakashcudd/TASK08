package javaintroduction;

import java.util.Scanner;

public class QUESTION02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Integer:");
		int number = scanner.nextInt();
		
		if (number%2==0) {
			System.out.println(number+" is a Even number");
		}
		else {
			System.out.println(number+" is not a Even number");
		}
	}

}
