package CS176L;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		
		String str = scanner.next().toLowerCase(); 
        str = str.replaceAll("[^a-z]", "");
		
		String Word=str;
		
		String rev="";
		
		int len=str.length();
		
		for(int i = len-1; i >= 0; i--) {
			rev=rev+str.charAt(i);
			
		}
		
		if(Word.equals(rev))
		{
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
		
		



