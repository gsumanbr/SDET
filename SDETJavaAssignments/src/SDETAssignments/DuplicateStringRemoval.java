// 27-Feb 21

package SDETAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateStringRemoval {

	private static String s;

	public static void main(String[] args) {
		getString();
		checkForDuplicates();
	}

	private static void checkForDuplicates() {
		List<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equalsIgnoreCase(list.get(j))) {
					System.out.println("i - " + list.get(i));
					System.out.println("j - " + list.get(j));

					list.remove(j);
				}
			}
		}

		String str = Arrays.toString(list.toArray());

		System.out.println("String - " + str);
	}

	private static void getString() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter string");

		s = input.nextLine();

		input.close();
	}

}
