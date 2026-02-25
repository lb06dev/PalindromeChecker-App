// MAIN CLASS - UseCase2PalindromeCheckerApp
// Use Case 2: Print a Hardcoded Palindrome Result
// This program checks whether a hardcoded string is a palindrome.

public class UseCase2PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Hardcoded string literal
        String input = "madam";

        // Reverse the string
        String reversed = "";

        // Loop to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check palindrome condition using if-else
        if (input.equals(reversed)) {
            System.out.println("Input : " + input);
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Input : " + input);
            System.out.println("Result: It is NOT a Palindrome");
        }

        // Program ends
    }
}