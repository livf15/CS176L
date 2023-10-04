package CS176L;
import java.util.Scanner;
public class ReadString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String input = scanner.nextLine();
		if (input.length() > 0) {
			char firstChar = input.charAt(0);
		if (Character.isDigit(firstChar)) {
			String firstDigitWord = digitToWord(firstChar);
			String newString = firstDigitWord + input.substring(1);
			System.out.println("New string: " + newString);
			} else {
		System.out.println("First character is not a numeric digit.");
		
		        }

		        scanner.close();}
		    }

		    private static String digitToWord(char digit) {
		        switch (digit) {
		            case '0':
		                return "zero";
		            case '1':
		                return "one";
		            case '2':
		                return "two";
		            case '3':
		                return "three";
		            case '4':
		                return "four";
		            case '5':
		                return "five";
		            case '6':
		                return "six";
		            case '7':
		                return "seven";
		            case '8':
		                return "eight";
		            case '9':
		                return "nine";
		            default:
		                return "";
		        }
		    } }
		

	
	
