public class Main {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC10 (Normalized Check)");

        String input = "A man a plan a canal Panama";

        // Normalize string
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}