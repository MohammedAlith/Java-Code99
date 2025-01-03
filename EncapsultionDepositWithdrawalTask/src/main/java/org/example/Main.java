package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Account account = new Account(90253521, "Mohammed Alith", "Male", 0.0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Account Number: ");
        long accountNumber = sc.nextLong();
        System.out.println("Pin: ");
        long pin = sc.nextLong();

        if (accountNumber == 123456 && pin == 9876) {
            System.out.println("Name: " + account.getName() + "\nContact: " + account.getContact() + "\nGender: " + account.getGender());
            while (true) {
                System.out.println("select option : \n 1.Deposit \n 2.Withdraw \n  4.Current Balnce \n 5.Exit");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.deposit(withdrawAmount);
                        break;

                    case 3:
                        System.out.println("Current Balance: " + account.getBal());
                        break;

                    case 4:
                        System.out.println("Exit");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}