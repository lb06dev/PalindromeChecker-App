/**
 *
 * MAIN CLASS - LindromeCheckerApp
 *
 * Use Case 5
 *
 * Description:
 * This class measures and compares the execution
 * performance of different palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses multiple palindrome validation implementations
 * - Captures execution start and end times
 * - Calculates total execution durations
 * - Displays benchmarking results
 *
 * This use case focuses on performance
 * measurement and algorithm comparison to
 * introduce benchmarking concepts.
 *
 * @author laksh
 * @version 5
 */

public class LindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "LeveL";
        String normalized = input.toLowerCase();

        System.out.println("=====================================");
        System.out.println("         LINDROME CHECKER APP        ");
        System.out.println("=====================================");
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

        // ==============================
        // Output Results
        // ==============================
        System.out.println("Palindrome Check Results:");
        System.out.println("Two Pointer : " + result1);
        System.out.println("Stack       : " + result2);
        System.out.println("Recursive   : " + result3);
        System.out.println();
        System.out.println("Execution Time Comparison (in ns):");
        System.out.println("Two Pointer : " + (end1 - start1));
        System.out.println("Stack       : " + (end2 - start2));
        System.out.println("Recursive   : " + (end3 - start3));
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