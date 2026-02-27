public class Main {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC9 (Recursive)");

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base case
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}