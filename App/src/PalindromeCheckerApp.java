// MAIN CLASS - UseCase11PalindromeCheckerApp
// Use Case 11: Object-Oriented Palindrome Service
// This program encapsulates palindrome logic in a separate class.

public class UseCase11PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "level";

        // Create instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Check palindrome
        boolean isPalindrome = checker.checkPalindrome(input);

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

// PalindromeChecker class encapsulates the palindrome logic
class PalindromeChecker {

    // Method to check palindrome using two-pointer approach
    public boolean checkPalindrome(String input) {

        // Normalize input to lowercase
        String normalized = input.toLowerCase();

        // Initialize two pointers
        int start = 0;
        int end = normalized.length() - 1;

        // Two-pointer comparison
        while (start < end) {

            // Compare characters at start and end
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            // Move pointers
            start++;
            end--;
        }

        return true;
    }
}