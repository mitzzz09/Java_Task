/*Write a Java program to generate the following * triangles. 
Test Data
Input the number: 6 
Expected Output :
****** 
***** 
**** 
*** 
** 
*
  */

  import java.util.Scanner;
  public class starpattern{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int rows= s.nextInt();
    for(int i=rows; i>=1; i--){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        // Print asterisks
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println("");
    }
    s.close();
    }
}