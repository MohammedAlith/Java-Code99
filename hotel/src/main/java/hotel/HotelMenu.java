package hotel;

import java.util.Scanner;




public class HotelMenu {
    public static void main(String[] args) {
        Items items = new Items();
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------Welcome to the Hotel's Menu----------------------");

        while (true) {
            System.out.println("Select your Favourite Hotel");
            System.out.println("1. Hotel Buhari");
            System.out.println("2. Hotel Darbar");
            System.out.println("3. Saravana Bhavan");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    items.Detail();
                    break;
                case 2:
                case 3:
                    System.out.println("Currently not available. Try Hotel Buhari.");
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for visiting!");
                  
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}