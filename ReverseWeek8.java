package CS176L;
import java.util.Scanner;
public class ReverseWeek8 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter string: ");
		String str="";
		str= scanner.nextLine();
		
		String reverse="";
	    for(int i=str.length()-1;i>=0;i--) {
		reverse= reverse+str.charAt(i);
		
	
		
		}
	    System.out.println(reverse);
		

	}

}
