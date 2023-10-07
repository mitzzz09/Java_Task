public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static String findPalindrome(String s) {
        while (s.length() >= 2) {
            if (isPalindrome(s)) {
                return s;
            }
            s = s.substring(1, s.length() - 1);
        }
        return "Palindrome possible";
    }
    
    public static void main(String[] args) {
        // Sample Input 1
        String inputStr1 = "Xyammabr";
        String result1 = findPalindrome(inputStr1);
        System.out.println(result1);
        
        // Sample Input 2
        String inputStr2 = "Arvcsdfhr";
        String result2 = findPalindrome(inputStr2);
        System.out.println(result2);
    }
}
