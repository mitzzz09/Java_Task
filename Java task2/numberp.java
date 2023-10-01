/* Write a Java program to make such a pattern like a pyramid with a number that repeats in the 
same row. 
    1 
  2   2
 3  3  3*/
 
 import java.util.Scanner;
 public class numberp{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows= s.nextInt();
        for(int i=1; i<=rows; i++){

            //Print the spaces in the row
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            //Print numbers in the row
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
        s.close();
    }
 }

