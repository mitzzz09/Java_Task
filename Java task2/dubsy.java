/*
 4. Write a Java program that reads a floating-point number and prints "zero" if the number is
zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number
is less than 1, or "large" if it exceeds 1,000,000.
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
 */

 import java.util.Scanner;
 public class dubsy{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      System.out.print("Enter the number: ");
      double n = s.nextDouble();
      if(n==0){
        System.out.print("Zero");
      }
      else if(n>1000000.0){
        System.out.print("Large");
      }
      else{
        System.out.print("Small");
      }
      s.close();
    } 
 }