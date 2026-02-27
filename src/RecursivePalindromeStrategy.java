public class RecursivePalindromeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        return isPalindrome(input, 0, input.length() - 1);
    }

    private boolean isPalindrome(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return isPalindrome(input, start + 1, end - 1);
    }
}
