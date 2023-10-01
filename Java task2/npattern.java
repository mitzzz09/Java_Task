/*Write a Java program to make such a pattern like a right angle triangle with the number 
increased by 1. 
The pattern like :
1
2 3
4 5 6
7 8 9 10 */

import java.util.Scanner;
public class npattern{
      public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      int currentNumber = 1;
      System.out.print("Enter the rows: ");
      int rows= s.nextInt();
      for(int i=1; i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(currentNumber +" ");
            currentNumber++;
        }
        System.out.println();
      }
      s.close();
    }
}