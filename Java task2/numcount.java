/*Write a Java program that reads an positive integer and count the number of digits the 
number (less than ten billion) has. 

Test Data
Input an integer number less than ten billion: 125463
Expected Output :
Number of digits in the number: 6 */

import java.util.Scanner;
public class numcount{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number less than 10 billion: ");
      long num= s.nextLong();
      if(num>=0 && num<10_000_000_000L){
        int count=0;

        while(num>0){
            num/=10;
            count++;
        }
        System.out.print("Number of digits: "+count);
      }
      else
      {
        System.out.println("Not in range!!!");
      }
      s.close();
    }
}