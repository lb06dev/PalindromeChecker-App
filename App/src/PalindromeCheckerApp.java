// MAIN CLASS - UseCase5PalindromeCheckerApp
// Use Case 5: Stack-Based Palindrome Checker
// This program uses Stack (LIFO) to validate palindrome.

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Create Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Variable to store palindrome status
        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            char popped = stack.pop();
            if (input.charAt(i) != popped) {
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