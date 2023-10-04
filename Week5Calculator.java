package CS176L;

import java.util.Scanner;

public class Week5Calculator {

	public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the first integer (n): ");
		  int n = scanner.nextInt();
	
		  System.out.print("Enter the operator (+, -, *, /): ");
		  char operator = scanner.next().charAt(0);
		  
		  System.out.print("Enter the second integer (m): ");
		  int m = scanner.nextInt();
		
		  double result = 0;
		  
		  switch (operator) {
		  case '+':
			  result = n + m;
			  break;
		  case '-':
			  result = n - m;
			  break;
		  case '*':
		  	  result = n * m;
		  	  break;
		  case '/':
			  if (m != 0) {
				  result = (double) n / m;
				  break; }
			  default:
	                System.out.println("Error: Invalid operator.");
	        }

	        System.out.println("Result: " + result);
	        scanner.close();
	}}

	


