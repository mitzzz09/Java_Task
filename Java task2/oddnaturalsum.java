/*15. Write a Java program that displays the sum of n odd natural numbers. 
Test Data
Input number of terms is: 5 
Expected Output :
The odd numbers are : 
1 
3 
5 
7 
9 
The Sum of odd Natural Number upto 5 terms is: 25 */

import java.util.Scanner;

public class oddnaturalsum{
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.print("Enter the total numbers: ");
      int count= s.nextInt();
      
        for(int j=0;j<count*2;j++){
            if(j%2 ==0){
                System.out.print(" ");
            }
            else
            {
                System.out.println(j);
            }
        }
     
      s.close();
    }
}