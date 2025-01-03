package hotel;

import java.util.Scanner;

public class HotelBuhari {
    int chickenBiriyani = 250, muttonBiriyani = 300, meals = 150, quantity;

    // Method to handle OTP generation and validation
    public boolean otp() {
        int otpGenerated = (int) (Math.random() * 999 + 999);
        System.out.println("Generating Your OTP... Please wait...");
        System.out.println("Your OTP is: " + otpGenerated);
        System.out.print("Enter your OTP: ");
        Scanner sc = new Scanner(System.in);
        int otpEntered = sc.nextInt();

        return otpEntered == otpGenerated; // Return true if OTP matches, false otherwise
    }
}

class Items extends HotelBuhari {
    Scanner sc = new Scanner(System.in);

    // Method to display food items and handle selection
    public void Detail() {
        while (true) {
            System.out.println("Select your Food");
            System.out.println("1. Chicken Biriyani");
            System.out.println("2. Mutton Biriyani");
            System.out.println("3. Meals");
            System.out.println("4. Exit");
            System.out.print("Enter your food option: ");
            int foodOption = sc.nextInt();

            switch (foodOption) {
                case 1:
                    processOrder("Chicken Biriyani", chickenBiriyani);
                    break;
                case 2:
                    processOrder("Mutton Biriyani", muttonBiriyani);
                    break;
                case 3:
                    processOrder("Meals", meals);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return; // Exit the method
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    // Method to process each food item order
    private void processOrder(String foodName, int price) {
        System.out.println(foodName + " Price: Rs. " + price);
        System.out.print("Enter the Quantity: ");
        quantity = sc.nextInt();
        System.out.println("Total Quantity: " + quantity);
        System.out.println("---------------Online Payment Method: ");
        
        while (true) {
            System.out.println("1. Google Pay");
            System.out.println("2. Phone Pay");
            System.out.println("3. Paytm");
            System.out.println("4. Exit");
            System.out.print("Select Payment Method: ");
            int paymentOption = sc.nextInt();

            switch (paymentOption) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Your Total Amount is: Rs. " + (quantity * price));
                    System.out.print("Enter the Amount to Pay: ");
                    int billAmount = sc.nextInt();
                    if (otp()) {
                        System.out.println("Payment Successful! Thank you for ordering " + foodName);
                    } else {
                        System.out.println("Wrong OTP! Payment failed.");
                    }
                   
                case 4:
                    System.out.println("Exiting Payment Methods...");
                  
                default:
                    System.out.println("Invalid payment option. Please try again.");
                    break;
            }
        }
    }
}
