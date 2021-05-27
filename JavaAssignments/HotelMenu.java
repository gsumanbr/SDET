// Program 2

package com.karthi.assessment;

import java.util.Map;
import java.util.Scanner;

public class HotelMenu {
	
	private static String itemType;
	private static int plates;

	private static Map<String, Integer> map
    = Map.of("dosa", 20,
             "idli", 10,
             "pongal", 30);
	
	public static void main(String[] args) {
		getUserInput();
		calculateBill(itemType);
	}
	
	private static void getUserInput() {
        Scanner input = new Scanner(System.in);
    	
        System.out.println("Enter item type - dosa/idli/pongal");

        itemType = input.next();
        
        if(!(itemType.equalsIgnoreCase("dosa") || itemType.equalsIgnoreCase("idli") || itemType.equalsIgnoreCase("pongal"))) {
            System.out.println("Incorrect input");
            getUserInput();
        }
        
        System.out.println("Enter no. of plates");
        plates = input.nextInt();

        input.close();		
	}
	
	private static void calculateBill(String itemType) {
		
		if(map.containsKey(itemType)) {
	        System.out.println("Final Bill - " + map.get(itemType.toLowerCase()) * plates);
		}
	}

}
