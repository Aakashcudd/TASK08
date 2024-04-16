package javaintroduction;

public class QUESTION06 {

	public static void main(String[] args) {
		int num= 5;
		long factorial = 1;
		int i = 1;
		
		while (i<= num) {
			factorial *= i;
			i++;
		}
       System.out.printf("Factorial of %d = %d", num, factorial);
	}

}
