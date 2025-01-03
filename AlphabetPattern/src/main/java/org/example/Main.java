package org.example;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (64 + k) + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (64 + k) + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print((char) (64 + k) + " ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print((char) (64 + k) + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");


        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j)+" ");
            }
            System.out.println();
        }
        System.out.println("-----------");


        for(int i=1; i<4; i++){
            for(int j=2; j>=i; j--){
                System.out.print("-");
            }
           for(int k=0; k<2*i-1; k++){
               System.out.print((char)(65+k));
           }
            System.out.println();
        }

    }
}