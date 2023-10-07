import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define the arrays
        int[] Z1 = {15, 13, 9, 26, 5, 84};
        int[] Z2 = {7, 13, 5, 9, 2, 21};
        int[] Z3 = {0, 13, 5, 16, 36, 88};
        int[] Z4 = {15, 10, 5, 9, 16};
        int[] Z5 = {18, 9, 17, 4, 2, 0};

        // Combine all arrays into a single list
        List<Integer> allElements = new ArrayList<>();
        allElements.addAll(Arrays.asList(boxArray(Z1)));
        allElements.addAll(Arrays.asList(boxArray(Z2)));
        allElements.addAll(Arrays.asList(boxArray(Z3)));
        allElements.addAll(Arrays.asList(boxArray(Z4)));
        allElements.addAll(Arrays.asList(boxArray(Z5)));

        // Sort the list of elements
        allElements.sort(Integer::compareTo);

        // Find and print elements repeated in three or more arrays
        List<Integer> repeatedElements = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < allElements.size(); i++) {
            if (allElements.get(i).equals(allElements.get(i - 1))) {
                count++;
            } else {
                if (count >= 3) {
                    repeatedElements.add(allElements.get(i - 1));
                }
                count = 1;
            }
        }

        // Check the last element
        if (count >= 3) {
            repeatedElements.add(allElements.get(allElements.size() - 1));
        }

        // Print the result or -1 if no elements are repeated
        if (!repeatedElements.isEmpty()) {
            for (int element : repeatedElements) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    // Helper method to convert an int array to Integer array
    private static Integer[] boxArray(int[] arr) {
        Integer[] boxedArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxedArray[i] = arr[i];
        }
        return boxedArray;
    }
}
