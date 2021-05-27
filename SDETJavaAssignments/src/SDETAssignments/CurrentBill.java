// Program 1

package SDETAssignments;

import java.util.Scanner;

public class CurrentBill {
	
	private static int houseType;
	private static int units;
	private static int bill;

	public static void main(String[] args) {
		
		
		getUserInput();
      
		calculateBill(houseType);
	}
	
	private static void getUserInput() {
        Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter residency type - ");
        System.out.println("Enter 1 for House");
        System.out.println("Enter 2 for Commercial");

        houseType = input.nextInt();
        
        if(!(houseType == 1 || houseType == 2)) {
            System.out.println("Incorrect input");
            getUserInput();
        }
        
        System.out.println("Enter Units");
        units = input.nextInt();

        input.close();		
	}

	private static void calculateBill(int houseType) {
		switch(houseType) {
		case 1:
			if(units > 0 && units <= 100) {
				bill = units * 3;
			} else if(units > 100 && units <= 200) {
				bill = units * 4;
			}
			break;
		case 2:
			if(units > 0 && units <= 100) {
				bill = units * 10;
			} else if(units > 100 && units <= 200) {
				bill = units * 20;
			}
			break;
			
		}
		
        System.out.println("Final Bill - " + bill);
	}

}
