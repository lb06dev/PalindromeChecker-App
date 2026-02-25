// MAIN CLASS - UseCase12PalindromeCheckerApp
// Use Case 12: Strategy Pattern for Palindrome Algorithms
// This program demonstrates dynamic selection of palindrome algorithms using Strategy Pattern.

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class UseCase12PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Example: use Stack strategy
        strategy = new StackStrategy();
        System.out.println("Using Stack Strategy:");
        displayResult(input, strategy);

        // Example: use Deque strategy
        strategy = new DequeStrategy();
        System.out.println("\nUsing Deque Strategy:");
        displayResult(input, strategy);

        // Program ends
    }

    // Helper method to display result
    private static void displayResult(String input, PalindromeStrategy strategy) {
        boolean result = strategy.isPalindrome(input);
        System.out.println("Input : " + input);
        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }
    }
}

// Strategy interface
interface PalindromeStrategy {

    // Method to check palindrome
    boolean isPalindrome(String input);
}

// Stack-based palindrome strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        // Normalize input
        String normalized = input.toLowerCase();

        // Use Stack to reverse
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based palindrome strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        // Normalize input
        String normalized = input.toLowerCase();

        // Use Deque
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}