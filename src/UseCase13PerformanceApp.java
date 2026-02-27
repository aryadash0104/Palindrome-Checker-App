public class UseCase13PerformanceApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeStrategy iterative = new IterativePalindromeStrategy();
        PalindromeStrategy recursive = new RecursivePalindromeStrategy();

        long startTime1 = System.nanoTime();
        boolean result1 = iterative.check(input);
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        boolean result2 = recursive.check(input);
        long endTime2 = System.nanoTime();

        System.out.println("Input: " + input);

        System.out.println("Iterative Result: " + result1);
        System.out.println("Iterative Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Recursive Result: " + result2);
        System.out.println("Recursive Time: " + (endTime2 - startTime2) + " ns");
    }
}
