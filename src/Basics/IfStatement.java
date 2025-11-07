package Basics;

import java.util.Scanner;

/**
 * THE IF STATEMENT IN JAVA
 * Decision-making statements that execute code based on conditions
 * Topics: if, if-else, if-else-if, nested if
 */
public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== IF STATEMENT EXAMPLES ===\n");

        // -----------------------------------
        // 1. SIMPLE IF STATEMENT
        // Executes code only if condition is true
        // -----------------------------------
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive\n");
        }

        // -----------------------------------
        // 2. IF-ELSE STATEMENT
        // Provides alternative when condition is false
        // -----------------------------------
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println();

        // -----------------------------------
        // 3. IF-ELSE-IF LADDER
        // Multiple conditions checked sequentially
        // -----------------------------------
        System.out.print("Enter your grade letter (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);

        if (grade == 'A') {
            System.out.println("Excellent! Outstanding performance.");
        } else if (grade == 'B') {
            System.out.println("Good! Above average performance.");
        } else if (grade == 'C') {
            System.out.println("Fair. Average performance.");
        } else if (grade == 'D') {
            System.out.println("Poor. Below average.");
        } else if (grade == 'F') {
            System.out.println("Fail. Needs significant improvement.");
        } else {
            System.out.println("Invalid grade entered.");
        }
        System.out.println();

        // -----------------------------------
        // 4. CHECKING EVEN OR ODD (From lecture)
        // Using modulus operator (%)
        // -----------------------------------
        System.out.print("Enter a number to check if even or odd: ");
        int checkNum = scanner.nextInt();

        if (checkNum % 2 == 0) {
            System.out.println(checkNum + " is even");
        } else {
            System.out.println(checkNum + " is odd");
        }
        System.out.println();

        // -----------------------------------
        // 5. LEAP YEAR CHECKER (From lecture - Example 4)
        // Complex condition with logical operators
        // -----------------------------------
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = scanner.nextInt();

        // A year is a leap year if:
        // - Divisible by 400, OR
        // - Divisible by 4 AND NOT divisible by 100
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        System.out.println();

        // -----------------------------------
        // 6. NESTED IF STATEMENTS
        // If statements inside other if statements
        // -----------------------------------
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("Are you a student? (yes/no): ");
            String isStudent = scanner.next();

            if (isStudent.equalsIgnoreCase("yes")) {
                System.out.println("Adult student discount available!");
            } else {
                System.out.println("Regular adult pricing.");
            }
        } else {
            System.out.println("Youth pricing applies.");
        }

        scanner.close();
    }
}

/*
 * KEY FEATURES OF IF STATEMENTS:
 * --------------------------------
 * 1. Can handle complex conditions with relational operators:
 *    ==  (equal to)
 *    !=  (not equal to)
 *    >   (greater than)
 *    <   (less than)
 *    >=  (greater than or equal to)
 *    <=  (less than or equal to)
 *
 * 2. Can use logical operators to combine conditions:
 *    &&  (AND - both conditions must be true)
 *    ||  (OR - at least one condition must be true)
 *    !   (NOT - inverts the condition)
 *
 * 3. Evaluates conditions sequentially until one is true
 * 4. Can handle ranges of values and compound expressions
 * 5. Very flexible - works with any data type
 */