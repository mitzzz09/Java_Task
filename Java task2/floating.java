/*
 6. Write a Java program that reads two floating-point numbers and tests whether they are the
same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589

Expected Output :
They are different
 */
import java.util.Scanner;

public class floating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input another floating-point number: ");
        double num2 = scanner.nextDouble();

        // Round both numbers to three decimal places
        double roundedNum1 = Math.round(num1 * 1000.0) / 1000.0;
        double roundedNum2 = Math.round(num2 * 1000.0) / 1000.0;

        // Compare the rounded numbers
        if (roundedNum1 == roundedNum2) {
            System.out.println("They are the same up to three decimal places.");
        } else {
            System.out.println("They are different.");
        }

        scanner.close();
    }
}
