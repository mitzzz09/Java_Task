/* 1. Write a Java program to get a number from the user and print whether it is positive or
negative.
Test Data
Input number: 35
Expected Output :
Number is positive
*/

import java.util.Scanner;
public class check{
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= s.nextInt();
        if(n>0){
            System.out.println("Number is positive!!!");
        }

        else if(n<0){
            System.out.println("Number is negative!!!");
        }
        s.close();
    }
}