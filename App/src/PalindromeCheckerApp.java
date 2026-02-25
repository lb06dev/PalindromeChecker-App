// MAIN CLASS - UseCase4PalindromeCheckerApp
// Use Case 4: Character Array Based Palindrome Check
// This program converts a string into a character array and checks palindrome using two-pointer technique.

public class UseCase4PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "radar";

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        // Variable to store palindrome status
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            // Compare characters at start and end
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            // Move pointers
            start++;
            end--;
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