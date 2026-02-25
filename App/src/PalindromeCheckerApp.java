/**
 *
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the starting point of the
 * Palindrome Checker Console Application.
 *
 * At this stage, the application:
 * - Displays welcome message
 * - Displays application name
 * - Displays application version
 *
 * No palindrome validation is performed in this use case.
 *
 * @author laksh
 * @version 1.0
 */

public class UseCase1PalindromeCheckerApp {

    /**
     * Application Entry Point
     * JVM starts execution from here.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("========================================");
        System.out.println("      Welcome to Palindrome Checker     ");
        System.out.println("========================================");
        System.out.println();

        // Application Details
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : 1.0");
        System.out.println();

        // Flow Control Message
        System.out.println("Application Started Successfully...");
        System.out.println("Ready for next use case implementation.");
    }
}