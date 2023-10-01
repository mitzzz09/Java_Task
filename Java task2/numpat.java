/*Write a program in Java to make such a pattern like a right angle triangle with a number 
which repeats a number in a row. 
The pattern is as follows :
1
22
333
4444 */

import java.util.Scanner;
public class numpat{
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.print("Enter the rows: ");
      int rows= s.nextInt();
      for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println("");
      }
      s.close();
    }
}