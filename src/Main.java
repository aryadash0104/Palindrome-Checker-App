public class Main {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC3");

        String input = "level";   // Hardcoded string
        String reversed = "";

        // Reverse using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals()
        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}