// MAIN CLASS - UseCase3PalindromeCheckerApp
// Use Case 3: Palindrome Check Using String Reverse
// This program reverses a string using a loop and checks if it is a palindrome.

public class UseCase3PalindromeCheckerApp {

    // Application Entry Point
    // JVM starts execution from here
    public static void main(String[] args) {

        // Original string
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display original and reversed string
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals() method
        if (input.equals(reversed)) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is NOT a Palindrome");
        }

        // Program ends
    }
}