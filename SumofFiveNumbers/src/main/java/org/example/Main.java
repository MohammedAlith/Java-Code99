package org.example;

import java.net.SocketOption;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //find Sum and Average of numbers

        //int sum=0;
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter Input Range");
        //int range=sc.nextInt();

        //for(int i=1; i<=range; i++){
        // System.out.println("Enter the "+i+" number : ");
        // int a=sc.nextInt();
        //sum=sum+a;

        //}
        //System.out.println("Sum Of Five Numbers  : "+ sum);
        //System.out.println("Average of Five Numbers  : "+ sum/range);

        //---------------------------------------------------

        //Pattern printing

        //for (int i = 1; i <= 5; i++) {
        //for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        //}
        //System.out.println();
        //}

        for(int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        System.out.println("-------------------------------------------");

        // Numeric pattern

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
             System.out.print(j+" ");
            }
            System.out.println();


            }

        System.out.println("-------------------------------------------");

        //Floyd's pattern
        int z=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
              z++;
                System.out.print(z+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");


        for(int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("---");
            }
            System.out.println();
            for (int j = 1; j <= 2; j++) {
                System.out.println(" |");
            }



        }

        }
    }


