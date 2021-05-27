//Program # 2
//Hotel Menu

 

package SDETAssignments;

 

import java.util.Scanner;

 

public class HotelBill {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        float billAmount;
        int NoofPlates;
        // TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Item No:");
        int ItemNo = myObj.nextInt();  // Read user input
        switch(ItemNo) {
        case 1:
            System.out.println("Enter No of Plates:");
            NoofPlates = myObj.nextInt(); // Read user input
            System.out.println("No of Plates Entered is: " + NoofPlates);
            billAmount = NoofPlates*20;
            System.out.println("Bill amount is"+billAmount);
            break;
        case 2:
            System.out.println("Enter No of Plates:");
            NoofPlates = myObj.nextInt(); // Read user input
            System.out.println("No of Plates Entered is: " + NoofPlates);
            billAmount = NoofPlates*10;
            System.out.println("Bill amount is"+billAmount);
            break;
        case 3:
            System.out.println("Enter No of Plates:");
            NoofPlates = myObj.nextInt(); // Read user input
            System.out.println("No of Plates Entered is: " + NoofPlates);
            billAmount = NoofPlates*30;
            System.out.println("Bill amount is"+billAmount);
            break;
        default:
            System.out.println("Invalid Item No given"+ItemNo);
        }
        
        
    }
    
	
}

 


 