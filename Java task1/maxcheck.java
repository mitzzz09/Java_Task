/*3. Write a Java program that takes three numbers from the user and prints the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87 */

import java.util.Scanner;

class maxcheck{
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a= s.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b= s.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c= s.nextInt();

        if(a>=c && a>=b){
            System.out.print("Maximum of three numbers: " +a);
        }
        else if(b>=c || b>=a){
        System.out.print("Maximum of three numbers: "+b);
        }

        else{
            System.out.print("Maximum of three numbers: "+ c);
        }
        s.close();
    }
}