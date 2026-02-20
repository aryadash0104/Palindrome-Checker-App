import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC6 (Queue + Stack)");

        String input = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both stack and queue
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {

            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}