package linearSearch;
import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int [] array= {10,20,30,40,50};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the search key: ");
	int key=sc.nextInt();
	
	boolean found=false;
	
	for(int i=0; i<array.length; i++) {
		if(array[i]==key) {
	 found=true;
		}
		
	}
	
	if(found) {
		System.out.println("value "+key+ " is present");
	}else {
		System.out.println("value "+key+ " is Not present");
	}
}
}
