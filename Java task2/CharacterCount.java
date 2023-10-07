public class CharacterCount {
    public static void main(String[] args) {
        char[] arr = {'w', 'e', 'v', 'e', 'r', 'w', 'm', 'r', 'e'};

        for (int i = 0; i < arr.length; i++) {
            // Check if the character is already counted
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    counted = true;
                    break;
                }
            }

            if (!counted) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " appeared in " + count + " times");
            }
        }
    }
}
