package Basics;

import java.util.Scanner;

/**
 * THE SWITCH STATEMENT IN JAVA
 * Cleaner way to execute one block of code among many alternatives
 * Best used when checking a single variable against several fixed values
 */
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SWITCH STATEMENT EXAMPLES ===\n");

        // -----------------------------------
        // 1. BASIC SWITCH WITH INT
        // Checking days of the week
        // -----------------------------------
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;  // break prevents fall-through to next case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:  // executes when no match is found
                System.out.println("Invalid day number!");
        }
        System.out.println();

        // -----------------------------------
        // 2. SWITCH WITH CHAR - VOWEL OR CONSONANT
        // (From lecture example)
        // Multiple cases can share the same code block
        // -----------------------------------
        System.out.print("Enter a character to check (vowel/consonant): ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for easier checking
        ch = Character.toLowerCase(ch);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                // Check if it's a letter
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant");
                } else {
                    System.out.println(ch + " is not a letter");
                }
        }
        System.out.println();

        // -----------------------------------
        // 3. SWITCH WITH STRING
        // Checking grades
        // -----------------------------------
        System.out.print("Enter your grade (A, B, C, D, F): ");
        String grade = scanner.next().toUpperCase();

        switch(grade) {
            case "A":
                System.out.println("Excellent! Score: 90-100");
                break;
            case "B":
                System.out.println("Good! Score: 80-89");
                break;
            case "C":
                System.out.println("Fair. Score: 70-79");
                break;
            case "D":
                System.out.println("Poor. Score: 60-69");
                break;
            case "F":
                System.out.println("Fail. Score: Below 60");
                break;
            default:
                System.out.println("Invalid grade!");
        }
        System.out.println();

        // -----------------------------------
        // 4. SWITCH FOR MENU SELECTION
        // Practical example
        // -----------------------------------
        System.out.println("=== Simple Calculator ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch(choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
        System.out.println();

        // -----------------------------------
        // 5. SWITCH WITHOUT BREAK (Fall-through)
        // Shows what happens when break is missing
        // -----------------------------------
        System.out.print("Enter a number (1-3): ");
        int testNum = scanner.nextInt();

        System.out.println("Without break keyword:");
        switch(testNum) {
            case 1:
                System.out.println("Case 1 executed");
                // No break - falls through to case 2
            case 2:
                System.out.println("Case 2 executed");
                // No break - falls through to case 3
            case 3:
                System.out.println("Case 3 executed");
                break;
            default:
                System.out.println("Default executed");
        }

        scanner.close();
    }
}

/*
 * KEY FEATURES OF SWITCH STATEMENT:
 * -----------------------------------
 * 1. Works with: byte, short, char, int, String, and enums
 * 2. Each case represents a possible value of the variable
 * 3. The break keyword prevents fall-through to the next case
 * 4. The default case executes when no match is found
 * 5. Multiple cases can share the same code block
 * 6. Faster than if-else when checking many fixed options
 * 7. More organized and readable for multiple fixed values
 *
 * WHEN TO USE SWITCH vs IF:
 * --------------------------
 * Use SWITCH when:
 * - Testing equality of a single variable
 * - Checking against multiple fixed/discrete values
 * - Need cleaner, more readable code for many options
 *
 * Use IF when:
 * - Need complex conditions (>, <, >=, <=, &&, ||)
 * - Working with ranges of values
 * - Need more flexibility
 * - Checking boolean conditions
 */