// Program 7

package SDETAssignments;

import java.util.Scanner;

public class EvenOdd {
	
	private static int length = 0;
	private static int array [];

	public static void main(String[] args) {
		getUserInput();
		getOddEvenNumbers();
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

	private static void getOddEvenNumbers() {
		for(int i = 0; i < length ; i++) {
			int num = array[i];
			System.out.println(num + " is " + (num%2 == 0  ? "even" :"odd"));
		}
		
	}

}
