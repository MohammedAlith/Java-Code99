package example;

import java.util.Scanner;
public class Test {
   public static void main(String[]args) {
	   String sentence = "A Man, A plane, a canal : panama";
//	   Scanner scanner = new Scanner(System.in);
//	   
//	   System.out.println("Enter an String"); 
	   String a="";
//	String course = scanner.nextLine();
	for(int i=sentence.length()-1; i>=0; i--) {
		a += sentence.charAt(i);
	}
	if(a.equals(sentence)) {
		System.out.println("palindrome");
	}else {
		System.out.println("Not palindrome");
	}
}
}
