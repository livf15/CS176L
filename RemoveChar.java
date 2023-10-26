package CS176L;
import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner userStr= new Scanner(System.in);
		System.out.println("Enter String: ");
		String value= userStr.nextLine();
		System.out.println("Enter character to remove: ");
		String remove= userStr.next();
		
		
		String reverse = value.replaceAll(remove, "");
		System.out.println(reverse);
		
	/*	for(int i=0; i < input.length(); i++); {
			char currentChar =input.charAt(i);
			if (currentChar != remove) {
				reverse.append(currentChar);
			}
		}
			System.out.println(reverse);
		} */
		
		
		
		
		
		
		
		
		
		
	}
      
}
