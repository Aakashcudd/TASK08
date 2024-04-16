package javaintroduction;

import java.util.Scanner;

public class QUESTION10 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Integer:");
		int n = scanner.nextInt();
		int count = 0;
		
		do {
			n/=10;
			++count;
		} while (n !=0);
		
		System.out.printf("Number of digits: %d", count);

	}

}
