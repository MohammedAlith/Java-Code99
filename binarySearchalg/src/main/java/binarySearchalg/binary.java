package binarySearchalg;

import java.util.Scanner;
public class binary {
	

	
	 public static void main(String[] args) {
		 
		 int[] array= {10, 20, 30, 40, 50, 60, 70, 80};
		 Scanner sc = new Scanner(System.in);
		 
		 int key = sc.nextInt();
		 
		 int mid =array.length/2;
		 
		 boolean found=false;
		 
		 for(int i=0; i<array.length; i++) {
			 if(array[i]==key) {
				 found=true;
			 }else if(array[i]>key) {
				 found=true;
			 }else if(array[i]<key) {
				 found=true;
			 }
		 }
		  
		 if(found) {
			 System.out.println("value "+key+" is present");
		 } else {
			 System.out.println("value "+key+" is Not present");
		 }
			 
		 }
	}


