public class Main {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC10 (Normalized Check)");

        String input = "A man a plan a canal Panama";

        // Normalize: remove non-letters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Original Input  : " + input);
        System.out.println("Normalized Input: " + normalized);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }
    }
}