package CS176L;
import java.util.Scanner;
public class RepeatingArray {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of array");
	int N = sc.nextInt();
	
	int array1[]= new int[N];
	System.out.println("Input");
	
	for(int i=0; i<N; i++) {
		
		array1[i]= sc.nextInt();
		{
	for(int i=0; i<array1.length; j++) {
		
		int count=0;
		for(int j=i; l<=array1.length; j++) {
			if(array1[i]==array1[j]) {
				
				count=count+1;
			}
			if(count>1) {
				System.out.println(array1[i]);
				break;
			}
		}
	}
	}
	}}
	
	
	
	
