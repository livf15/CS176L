package CS176L;
import java.util.Arrays;
import java.util.Scanner;
public class ConvertRomDec {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        rearrangeAndPrint(inputString);

	        scanner.close();
	    }

	    private static void rearrangeAndPrint(String inputString) {
	        char[] charArray = inputString.toCharArray();
	        Arrays.sort(charArray);

	        int digitSum = 0;

	        StringBuilder rearrangedString = new StringBuilder();

	        for (char ch : charArray) {
	            if (Character.isAlphabetic(ch)) {
	                rearrangedString.append(ch);
	            } else if (Character.isDigit(ch)) {
	                digitSum += Character.getNumericValue(ch);
	            }
	        }

	     
	        System.out.println("Rearranged String: " + rearrangedString.toString());
	        System.out.println("Sum of Digits: " + digitSum);
	    }
	}


	

	
	       
