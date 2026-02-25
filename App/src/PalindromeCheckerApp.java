/**
 *
         * MAIN CLASS - UseCase13PalindromeCheckerApp
 *
         * Use Case 13: Performance Comparison
 *
         * Description:
        * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
         * At this stage, the application:
        * - Uses palindrome validation implementations
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
         * This use case focuses purely on performance
 * measurement and algorithm comparison.
        *
        * The goal is to introduce benchmarking concepts.
 *
         * @author laksh
 * @version 13.0
        */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "LeveL";
        String normalized = input.toLowerCase();

        System.out.println("Input : " + input);
        System.out.println();

        // ==============================
        // Two Pointer Benchmark
        // ==============================
        long start1 = System.nanoTime();
        boolean result1 = twoPointer(normalized);
        long end1 = System.nanoTime();

        // ==============================
        // Stack Benchmark
        // ==============================
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(normalized);
        long end2 = System.nanoTime();

        // ==============================
        // Recursive Benchmark
        // ==============================
        long start3 = System.nanoTime();
        boolean result3 = recursive(normalized, 0, normalized.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Is Palindrome? : " + result1);
        System.out.println();
        System.out.println("Execution Time Comparison:");
        System.out.println("Two Pointer : " + (end1 - start1) + " ns");
        System.out.println("Stack       : " + (end2 - start2) + " ns");
        System.out.println("Recursive   : " + (end3 - start3) + " ns");
    }

    // ------------------------------
    // Two Pointer Method
    // ------------------------------
    private static boolean twoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // ------------------------------
    // Stack Method
    // ------------------------------
    private static boolean stackMethod(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ------------------------------
    // Recursive Method
    // ------------------------------
    private static boolean recursive(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return recursive(input, start + 1, end - 1);
    }
}