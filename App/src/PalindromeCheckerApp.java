/**
 *
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation
 * using both Queue (FIFO) and Stack (LIFO) data structures.
 *
 * The goal is to show how First In First Out (Queue)
 * and Last In First Out (Stack) behaviors can be compared
 * to validate palindrome strings.
 *
 * Flow:
 * 1. Enqueue characters into Queue
 * 2. Push characters into Stack
 * 3. Compare Dequeue vs Pop outputs
 * 4. Determine whether input is a palindrome
 *
 * Key Concepts:
 * - Queue: Follows FIFO (First In First Out)
 * - Stack: Follows LIFO (Last In First Out)
 * - Logical Comparison: Compare elements popped from stack
 *   with elements dequeued from queue to validate palindrome
 *
 * Data Structures Used: Queue, Stack
 *
 * @author laksh
 * @version 6.0
 */

import java.util.*;

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("       LINDROME CHECKER APP - UC6    ");
        System.out.println("=====================================");
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        String normalized = input.toLowerCase().replaceAll("\\s+", ""); // Ignore case and spaces

        boolean isPalindrome = isPalindromeUsingQueueAndStack(normalized);

        System.out.println("-------------------------------------");
        System.out.println("Input Text  : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("-------------------------------------");

        scanner.close();
    }

    /**
     * Method: isPalindromeUsingQueueAndStack
     * Description: Checks palindrome using both Queue and Stack
     */
    private static boolean isPalindromeUsingQueueAndStack(String input) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push each character
        for (char c : input.toCharArray()) {
            queue.add(c);  // FIFO
            stack.push(c); // LIFO
        }

        // Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }
}