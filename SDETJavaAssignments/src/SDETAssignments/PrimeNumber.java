// Program 4

package SDETAssignments;

import java.util.Scanner;

public class PrimeNumber {
	private static int number;
	private static int flag = 0;

	public static void main(String[] args) {
		
		getUserInput();
      
		findPrimeOrNot(number);
	}
	
	private static void getUserInput() {
        Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter number");
        number = input.nextInt();

        input.close();		
	}

	private static void findPrimeOrNot(int month) {
		for(int i = 2; i <= number/2 ; i++) {
			if(number % i == 0) {
				flag = 1;
			}
		}
		
		if(flag == 0) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}
}
