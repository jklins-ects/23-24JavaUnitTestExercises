public class StringManipulator {

    // Reverse a given string
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Count occurrences of a character in a string
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // Concatenate two strings
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Check if a string contains a substring
    public static boolean containsSubstring(String str, String substring) {
        int n = str.length();
        int m = substring.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }

    // Check if a string starts with a prefix
    public static boolean startsWithPrefix(String str, String prefix) {
        int n = str.length();
        int m = prefix.length();
        if (m > n) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
