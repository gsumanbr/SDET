// Program 8

package SDETAssignments;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateNumbersCount {
		
		private static int length = 0;
		private static int array [];

		public static void main(String[] args) {
			getUserInput();
			getDuplicateNumberCount();
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

		private static void getDuplicateNumberCount() {
			HashSet<Integer> hs = new HashSet();
			for(int i = 0; i < length ; i++) {
				for(int j = i+1; j < length - 1; j++) {
					if(array[i] == array[j]) {
						hs.add(array[i]);
					}
				}
			}
			
			System.out.println("No. of duplicate entries - " + hs.size());	
		}
}


