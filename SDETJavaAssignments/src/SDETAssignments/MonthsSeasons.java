// Program 3

package SDETAssignments;

import java.util.Scanner;

public class MonthsSeasons {
	
	private static int month;

	public static void main(String[] args) {
		
		getUserInput();
      
		calculateSeason(month);
	}
	
	private static void getUserInput() {
        Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter month");

        month = input.nextInt();
        
        if(!(month >= 1 || month <= 12)) {
            System.out.println("Incorrect input");
            getUserInput();
        }

        input.close();		
	}

	private static void calculateSeason(int month) {
		switch(month) {
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Summer Season"); break;

		case 5:
		case 6:
		case 7:
		case 8: System.out.println("Winter Season"); break;

		case 9:
		case 10:
		case 11:
		case 12: System.out.println("Rainy Season"); break;

		}
}
}
