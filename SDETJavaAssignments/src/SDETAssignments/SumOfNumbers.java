// Program 5

package SDETAssignments;

public class SumOfNumbers {
	
	private static int sum = 0;
	private static int product = 1;

	public static void main(String[] args) {
		getSumAndProduct();
	}

	private static void getSumAndProduct() {
		for(int i = 1; i <= 10 ; i++) {
			sum += i;
			product *= i;
		}
		
		System.out.println("Sum of first 10 numbers - " + sum);
		System.out.println("Product of first 10 numbers - " + product);
	}
}
