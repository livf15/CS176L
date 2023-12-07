package CS176L;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a list of integers (separated by spaces):");
		        String input = scanner.nextLine();

		        try {
		            if (hasDuplicates(input)) {
		                System.out.println("Duplicate numbers found in the list.");
		            } else {
		                System.out.println("No duplicates found in the list.");
		            }
		        } catch (NumberFormatException e) {
		            System.out.println("Invalid input. Please enter valid integers separated by spaces.");
		        }
		    }

		    private static boolean hasDuplicates(String input) throws NumberFormatException {
		        String[] numbersArray = input.split(" ");
		        Set<Integer> uniqueNumbers = new HashSet<>();

		        for (String numStr : numbersArray) {
		            int number = Integer.parseInt(numStr);
		            if (!uniqueNumbers.add(number)) {
		                return true; 
		            }
		        }

		        return false; 
		    }
		


		    {

}
}

