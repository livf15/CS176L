package CS176L;
import java.util.Scanner;
public class NonRepeat {
	
	static void notRep(int [] arr)
	{
		int n = arr.length;
		boolean found = false;
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++)
				if(i !=j && arr[i] == arr[j]) {
					count++;
			break;
		}
	}
	if (count == 0) {
		System.out.println("First non-repeat element:" + arr[i]);
		found = true;
		return;
}}

	public static void main(String[] args) {
		notRep(new int[] {9,4,9,6,7,4});
		

}
}
