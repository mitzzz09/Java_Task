/*
5. Write a Java program that takes a number from the user and generates an integer between 1
and 7. It displays the weekday name.
Test Data
Input number: 3
Expected Output :
Wednesday
 */

import java.util.*;
 public class weekday {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number (1-7): ");
        int n= s.nextInt();
        
        switch(n){
             default:
            {
                System.out.println("Enter correct choice");
                break;
            }

            case 1:
            {
                System.out.println("Monday");
                break;
            }

            case 2:
            {
                System.out.println("Tuesday");
                break;
            }

            case 3: 
            {
                System.out.println("Wednesday");
                break;
            }

            case 4:
            {
                System.out.println("Thursday");
                break;
            }

            case 5:
            {
                System.out.println("Friday");
                break;
            }

            case 6:
            {
                System.out.println("Saturday");
                break;
            }

            case 7:
            {
                System.out.println("Sunday");
                break;
            }

           

        }
        s.close();
    }
    
}
