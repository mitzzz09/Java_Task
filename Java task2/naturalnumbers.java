/*. Write a Java program to display the first 10 natural numbers. 
Expected Output :
The first 10 natural numbers are: 
 
1 
2 
3 
4 
5 
6 
7 
8 
9 
10 */

import java.util.Scanner;
public class naturalnumbers{
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.print("Enter the total numbers to be displayed: ");
      int n= s.nextInt();
      for(int i=1; i<=n; i++){
        System.out.println(i);
      }
      s.close();
    }
}