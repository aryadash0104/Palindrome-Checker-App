public class UseCase12StrategyApp {

    public static void main(String[] args) {

        String input = "madam";

        PalindromeStrategy strategy = new SimplePalindromeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
