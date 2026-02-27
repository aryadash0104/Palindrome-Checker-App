import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC7 (Deque Based)");

        String input = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Add all characters into deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}