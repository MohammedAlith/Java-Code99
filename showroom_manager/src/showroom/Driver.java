package showroom;

import java.util.*;

public class Driver {

	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
//		Manager ****************************************************
		Manager m=new Manager(2468,"Jhonny","Jhonny123");
		
//		Car***********************************************
		Vehicle c1=new Car("Kia",2000000,"Seltos","Petrol",1800);
		Vehicle c2=new Car("Hyundai",2400000,"Creta","Petrol",1750);
		
//		Bike***********************************************
		Vehicle b1=new Car("Honda",500000,"CB600","Petrol",600);
		Vehicle b2=new Car("Husquvarna",400000,"Swartpilen","Petrol",250);
		boolean b=true;
		
//		Loop********************************************
		do {
		System.out.println("*****************************************************Welcome to showroom******************************************************");
		System.out.println("1. Manager Login \n"
				+ "2. Exit\n"
				+ "Choose the option.");
		int a=s.nextInt();
		
		if(a==1) {
//			Login page*************************************************
			
//			Manager m=new Manager(2468,"Jhonny","Jhonny123");
			m.prnt();
			System.out.println("Enter Id :");
			int id=s.nextInt();		
			System.out.println("Enter name :");
			String name=s.next();
			System.out.println("Enter Password :");
			String pass=s.next();
			int di=m.Getid();
			String eman=m.Getname();
			String ssap=m.Getpass();
			
			
//			System.out.println(id==di);
//			System.out.println(di);
//			System.out.println(name==eman);
//			System.out.println(eman);
//			System.out.println(pass==ssap);
//			System.out.println(ssap);
			
			
			if(id==di)   {
				if(name.equals(eman)) {
					if(pass.equals(ssap)) {
						System.out.println("********************Login successfull************************");
						System.out.println("1. Car\n"
								+ "2. Bike\n"
								+ "3.Exit\n"
								+ "Choose the Option:");
						int c=s.nextInt();
						if(c==1) {
							
							
							c1.Specs();
							c2.Specs();
							
							
						}else if(c==2){
							
							
							b1.Specs();
							b2.Specs();
							
						}else if (c==3) {
							System.out.println("Logout Successfull");
							b=false;
						}else {
							System.out.println("Invalid");
						}
					}else {
						System.out.println("Wrond Password ");
					}
				}else {
					System.out.println("Wrond name ");
				}
				
			}
			else {
				System.out.println("Wrond ID ");
			}
			
			
		}
		else if(a==2) {
			System.out.println("Logout Successfull");
			b=false;
		}
		else {
			System.out.println("Invalid");
		}
		
		}while(b==true);
		
	
	}
}
