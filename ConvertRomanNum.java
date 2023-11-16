package CS176L;
import java.util.Scanner;

public class ConvertRomanNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 3999: ");
		int decimal = scanner.nextInt();
		if (decimal >= 1 && decimal <= 3999) {
			String roman = convertToRoman(decimal);
			System.out.println("Roman numeral: " + roman);
			} else {
				System.out.println("Please enter a valid decimal number between 1 and 3999.");
		        }

		        scanner.close();
		    }
	public static String convertToRoman(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D",
				"CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				result.append(symbols[i]);
				num -= values[i];
		            }
		        }

		        return result.toString();
		    }
		


	}


