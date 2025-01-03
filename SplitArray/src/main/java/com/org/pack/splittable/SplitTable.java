package com.org.pack.splittable;
import java.util.Arrays;
public class SplitTable {
  public static void main(String[]args) {

	


	char a[]= {'1','k','A','2','m','I','$','*'};
	char b[]= new char[2];
	char c[]= new char[2];
	char d[]= new char[2];
	char e[]= new char[2];
	int b1=1;
	int c1=0;
	int d1=0;
	int e1=0;
	
//	System.out.println((int)(b));
	for(int i=0;i<a.length;i++) {
		if(((int)(a[i]))>=48 && ((int)(a[i]))<=57) {
			b[b1]=a[i];
			b1--;
			
		}else if(((int)(a[i]))>=65 && ((int)(a[i]))<=90) {
			int nw=((int)(a[i]))+32;
			c[c1]=(char)(nw);

			c1++;
			
		}else if(((int)(a[i]))>=97 && ((int)(a[i]))<=122){
			int nw=((int)(a[i]))-32;
			d[d1]=(char)(nw);
			d1++;
		} else {
//			System.out.println(a[i]);
			e[e1]=a[i];
			e1++;
		}
		
		
	}
	
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(d));
	System.out.println(Arrays.toString(e));
	} 
}
