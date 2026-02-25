// MAIN CLASS - UseCase10PalindromeCheckerApp
// Use Case 10: Case-Insensitive & Space-Ignored Palindrome
// This program ignores spaces and case while checking palindrome.

public class UseCase10PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String input = "Never Odd Or Even";

        // Normalize string by removing spaces using regex
        String noSpaces = input.replaceAll("\\s+", "");

        // Convert to lowercase for case-insensitive comparison
        String normalized = noSpaces.toLowerCase();

        // Initialize two pointers
        int start = 0;
        int end = normalized.length() - 1;

        // Variable to store palindrome status
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            // Compare characters
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            // Move pointers
            start++;
            end--;
        }

        // Display original input
        System.out.println("Original Input  : " + input);

        // Display normalized string
        System.out.println("Normalized Input: " + normalized);

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        // Program ends
    }
}