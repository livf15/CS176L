package CS176L;
import java.util.Scanner;

public class GCD {
	final int MIN=0;
	final int MAX=1000;  

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:  ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if ( a < 0 || b < 0) {
			System.out.println("Error, try again");
		}
		
		int g=0;
		
		for(int i=1; i <= a; i++) {
			if(a%i == 0 && b%i == 0 )
				g=i;
			
		}
		System.out.println("GCD  "+ g);
		
		

	}

}
