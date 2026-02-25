// MAIN CLASS - UseCase7PalindromeCheckerApp
// Use Case 7: Deque-Based Optimized Palindrome Checker
// This program uses Deque to compare front and rear characters.

import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "racecar";

        // Create Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Variable to store palindrome status
        boolean isPalindrome = true;

        // Compare front and rear until deque size is greater than 1
        while (deque.size() > 1) {

            // Remove first and last characters
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            // Compare characters
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display input
        System.out.println("Input : " + input);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        // Program ends
    }
}