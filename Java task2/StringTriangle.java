/*Collect the string with an odd number size. Form a triangle shape using the
collected string. Print a statement “Invalid string”, If the sting size is not odd number.
Sample Input 1:
welcome
Sample Output 1:
c
lco
elcom
welcome
Sample Input 2:
good
Sample Output 2:
Invalid string */


import java.util.Scanner;

public class StringTriangle {
    // Function to check if the string size is odd or even
    public static boolean isOddLength(String s) {
        return s.length() % 2 != 0;
    }

    // Function to form a triangle shape from the string
    public static void formTriangle(String string) {
        if (!isOddLength(string)) {
            System.out.println("Invalid string");
            return;
        }

        int n = string.length();
        for (int i = 0; i < n; i++) {
            System.out.println(string.substring(0, i + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        formTriangle(inputString);
        scanner.close();
    }
}
