package com.org.pack.mergetable;

import java.util.Scanner;

public class MergeTable {
	public static void main(String[] args) {
//		int a[] = {10,20,30};
//		int b[] = {40,60};
//		int c[] = new int[a.length + b.length];
//		for(int i=0; i<a.length; i++) {
//			c[i]=a[i];
//		}
//		
//		for(int i=0; i<b.length; i++) {
//			c[i+a.length]=b[b.length-1-i];
//		}
//		
//		System.out.print("MergeTable: ");
//		for(int i=0; i<c.length; i++) {
//			System.out.print(" "+c[i]);
//		}
		
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the Length of the First table: ");
    int firstTable=sc.nextInt();
    
    System.out.print("Enter the Length of the Second table: ");
    int secondTable=sc.nextInt();
    
    System.out.println("-------------------------------------");
    
    
    System.out.println("Enter the Elements of Table1: ");
    int table1[]=new int[firstTable];
    for(int i=0; i<firstTable; i++) {
    	 System.out.println("Enter the Element of "+ i +" Table1: ");
    	
    	table1[i]=sc.nextInt();
    	 System.out.println("-------------------------------------");
    	
    }
    
    
    System.out.println("-------------------------------------");
    
    
    System.out.println("Enter the Elements of Table2: ");
    int table2[]=new int[secondTable];
    for(int i=0; i<secondTable; i++) {
    	System.out.println("Enter the Element of "+ i +" Table2: ");
    	
    	table2[i]=sc.nextInt();
    	 System.out.println("-------------------------------------");
    }
       
    for(int i=0; i<table1.length; i++) {
    	 System.out.println(table1[i]);
    }
    
    for(int i=0; i<table1.length; i++) {
   	 System.out.println(table2[i]);
   }
    
    
    int c[] = new int[table1.length + table2.length];
	for(int i=0; i<table1.length; i++) {
		c[i]=table1[i];
	}
	
	for(int i=0; i<table2.length; i++) {
		c[i+table1.length]=table2[table2.length-1-i];
	}
	
	System.out.print("MergeTable: ");
	for(int i=0; i<c.length; i++) {
		System.out.print(" "+c[i]);
	}
    
	}
	
	

}
