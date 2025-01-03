package com.foodCourt;

import java.util.Scanner;
public class FoodCourt {
	 public static void main(String[] args) throws InterruptedException {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("\t\t\t\t\t** Select Your Favourite Hotel **");
	        
	        while (true) {
	            Thread.sleep(1000);
	            System.out.println("1. Saravana Bavan");
	            System.out.println("2. Muniyandi Vilas");
	            System.out.println("3. EXIT");
	            System.out.print("Enter Your Option: ");
	            int option = sc.nextInt();
	            
	            switch (option) {
	                case 1:
	                    handleSaravanaBavan(sc);
	                    break;
	                case 2:
	                    handleMuniyandiVilas(sc);
	                    break;
	                case 3:
	                    System.out.println("\t\t\t\t\t** THANK YOU **");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid Option");
	            }
	        }
	 }

	    private static void handleSaravanaBavan(Scanner sc) throws InterruptedException {
	        System.out.println("WELCOME TO Saravana Bavan");
	        while (true) {
	            System.out.println("1. Curd Rice (Rs.60.0)");
	            System.out.println("2. Tomato Rice (Rs.70.0)");
	            System.out.println("3. Sambar Rice (Rs.50.0)");
	            System.out.println("4. Lemon Rice (Rs.80.0)");
	            System.out.println("5. Exit");
	            System.out.print("Choose Your Food: ");
	            int choose = sc.nextInt();
	            
	            if (choose == 5) {
	                break;
	            }

	            int price = getPriceForSaravanaBavan(choose);
	            if (price == -1) {
	                System.out.println("Invalid choice. Please try again.");
	                continue;
	            }

	            processOrder(sc, price);
	        }
	    }

	    private static void handleMuniyandiVilas(Scanner sc) throws InterruptedException {
	        System.out.println("WELCOME TO Muniyandi Vilas");
	        while (true) {
	            System.out.println("1. Chicken Biryani (Rs.200.0)");
	            System.out.println("2. Fried Rice (Rs.150.0)");
	            System.out.println("3. Mutton Biryani (Rs.250.0)");
	            System.out.println("4. Porota (Rs.100.0)");
	            System.out.println("5. Exit");
	            System.out.print("Choose Your Food: ");
	            int choose = sc.nextInt();
	            
	            if (choose == 5) {
	                break;
	            }

	            int price = getPriceForMuniyandiVilas(choose);
	            if (price == -1) {
	                System.out.println("Invalid choice. Please try again.");
	                continue;
	            }

	            processOrder(sc, price);
	        }
	    }

	    private static int getPriceForSaravanaBavan(int choice) {
	        switch (choice) {
	            case 1: return 60;
	            case 2: return 70;
	            case 3: return 50;
	            case 4: return 80;
	            default: return -1;
	        }
	    }

	    private static int getPriceForMuniyandiVilas(int choice) {
	        switch (choice) {
	            case 1: return 200;
	            case 2: return 150;
	            case 3: return 250;
	            case 4: return 100;
	            default: return -1;
	        }
	    }

	    private static void processOrder(Scanner sc, int price) throws InterruptedException {
	        System.out.print("Enter the Quantity: ");
	        int qty = sc.nextInt();
	        int totalPrice = price * qty;
	        System.out.println("You chose " + qty + " item(s) with a total price of Rs." + totalPrice);

	        Thread.sleep(1000);
	        System.out.println("Your Online Payment");
	        while (true) {
	            System.out.println("1. Google Pay");
	            System.out.println("2. Phone Pay");
	            System.out.println("3. Paytm");
	            System.out.println("4. Exit");
	            System.out.print("Choose the type of online payment: ");
	            int pay = sc.nextInt();

	            if (pay == 4) {
	                System.out.println("Thank you");
	                break;
	            }

	            if (pay < 1 || pay > 3) {
	                System.out.println("Invalid payment option. Please try again.");
	                continue;
	            }

	            int otp = (int) (Math.random() * 9999); // Generate a 4-digit OTP
	            System.out.println("Your OTP is: " + otp);
	            System.out.print("Please enter the OTP: ");
	            int enteredOtp = sc.nextInt();

	            if (otp == enteredOtp) {
	                Thread.sleep(1000);
	                System.out.println("****** Payment Success! Thank You! ******");
	                break;
	            } else {
	               System.out.println("Invalid Otp. Try Again");
	            }
	        }
	    }
	}

