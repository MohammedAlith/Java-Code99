package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
*/

        //int i = 1;

      //  boolean a = true;
       // while (a) {
           // System.out.println(i);
          //  if (i == 10) {
               // break;
           // }
           // i++;
        //}
       // System.out.println("-------------------------");


        /*int i = 1;
         int count=0;
        boolean a = true;
        while (a) {
            count=count+1;
            System.out.println(count);
            if (count == 10) {
                break;
            }
            i++;
        }*/


        Scanner sc=new Scanner(System.in);


        System.out.println("UserName: ");
        String userName=sc.next();

        System.out.println("password: ");
        String password=sc.next();
        if((userName==" MohammedAlith") &&  (password==" Smda@123")) {
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Incorrect UserName 0r password");
        }

        /*long faceId=100011100, finger=110011000, pin=132120123;
        String password="Smda@123";
        if(faceId==100011100 || finger==110011110 || pin==132120123 || password=="smda123" ){
            System.out.println("Mobile unlocked");
        }else {
            System.out.println("Mobile locked");
        }*/
    }
}