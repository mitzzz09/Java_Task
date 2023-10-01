/* 21. Write a Java program to display the pattern like a diamond. 
Test Data
Input number of rows (half of the diamond) : 7 
Expected Output :
 
 * 
 *** 
 ***** 
 ******* 
 ********* 
*********** 
************* 
*********** 
 ********* 
 ******* 
 ***** 
 *** 
 *
 * */
 
import java.util.Scanner;

public class nump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows (half of the diamond): ");
        int numRows = scanner.nextInt();
        scanner.close();

        // Print upper half of the diamond
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower half of the diamond (excluding the middle row)
        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


