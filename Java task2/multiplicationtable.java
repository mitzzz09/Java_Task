/* Write a Java program to display the multiplication table of a given integer. 
Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0 
5 X 1 = 5 
5 X 2 = 10 
5 X 3 = 15 
5 X 4 = 20 
5 X 5 = 25*/

import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number for multiplication: ");
        int n= s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        s.close();

    }
}