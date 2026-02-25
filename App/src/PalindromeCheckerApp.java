// MAIN CLASS - UseCase9PalindromeCheckerApp
// Use Case 9: Recursive Palindrome Checker
// This program checks palindrome using recursion.

public class UseCase9PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Call recursive method
        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

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

    // Recursive method to check palindrome
    private static boolean checkPalindrome(String input, int start, int end) {

        // Base condition to stop recursion
        if (start >= end) {
            return true;
        }

        // Compare characters at start and end
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call with updated indices
        return checkPalindrome(input, start + 1, end - 1);
    }
}