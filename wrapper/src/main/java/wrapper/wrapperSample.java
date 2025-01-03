package wrapper;

import java.security.PublicKey;

public class wrapperSample {
	public static void main(String[]args) {
		
		//boxing
//		int a=10;
//		Integer ref= Integer.valueOf(a);
//		System.out.println(ref);
//	
//		int b=ref;  //unboxing
//		System.out.println(b);
		
		int num=10;
		Integer store = Integer.valueOf(num);
		Integer val =10;
		System.out.println(store==val);
	}
	
}
	
	
