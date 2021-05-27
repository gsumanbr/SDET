// Program 6

package SDETAssignments;

import java.util.Scanner;

public class DuplicateNumbers {
	
	private static int length = 0;
	private static int array [];
	private static int sum = 0;
	private static int product = 1;

	public static void main(String[] args) {
		getUserInput();
		getSumAndProduct();
	}
	
	private static void getUserInput() {
        Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter array size");
        length = input.nextInt();
        
        array = new int[length];
        
        System.out.println("Enter array values");
		for(int i = 0; i < length ; i++) {
			array[i] = input.nextInt();
		}


        input.close();		
	}

	private static void getSumAndProduct() {
		for(int i = 0; i < length ; i++) {
			sum += array[i];
			product *= array[i];
		}
		
		System.out.println("Sum - " + sum);
		System.out.println("Product - " + product);
	}
}
