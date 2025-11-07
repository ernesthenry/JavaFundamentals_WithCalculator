package Basics;

import java.util.Scanner;

/**
 * READING INPUT IN JAVA
 * This program demonstrates how to read different types of input from users
 * Topics covered: Scanner class, reading int, byte, float, String
 */
public class ReadingInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        // System.in represents the standard input stream (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== READING INPUT EXAMPLES ===\n");

        // -----------------------------------
        // 1. READING BYTE (small integers: -128 to 127)
        // -----------------------------------
        System.out.print("Enter your age (byte): ");  // Use print (not println) so input appears on same line
        byte age = scanner.nextByte();
        System.out.println("You are: " + age + " years old\n");

        // -----------------------------------
        // 2. READING INT (whole numbers)
        // -----------------------------------
        System.out.print("Enter a whole number (int): ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number + "\n");

        // -----------------------------------
        // 3. READING FLOAT (decimal numbers)
        // -----------------------------------
        System.out.print("Enter a decimal number (float): ");
        float price = scanner.nextFloat();
        System.out.println("You entered: " + price + "\n");

        // -----------------------------------
        // 4. READING STRING
        // -----------------------------------
        // IMPORTANT: Need to consume the leftover newline character
        scanner.nextLine();  // This clears the buffer

        System.out.print("Enter your name (String): ");
        String name = scanner.nextLine();  // nextLine() reads the entire line including spaces
        System.out.println("You are: " + name + "\n");

        // -----------------------------------
        // 5. READING DOUBLE (for more precise decimals)
        // -----------------------------------
        System.out.print("Enter a precise decimal (double): ");
        double salary = scanner.nextDouble();
        System.out.println("Salary: " + salary + "\n");

        // -----------------------------------
        // IMPORTANT NOTES:
        // -----------------------------------
        // 1. Use print() instead of println() to keep input on same line
        // 2. Match the data type: nextByte() for byte, nextInt() for int, etc.
        // 3. If you enter wrong type (e.g., text when expecting number), 
        //    the program will throw InputMismatchException
        // 4. Always close the scanner when done (good practice)

        scanner.close();
        System.out.println("Program completed successfully!");
    }
}

/*
 * SCANNER METHODS REFERENCE:
 * ---------------------------
 * scanner.nextByte()    - reads a byte value
 * scanner.nextShort()   - reads a short value
 * scanner.nextInt()     - reads an int value
 * scanner.nextLong()    - reads a long value
 * scanner.nextFloat()   - reads a float value
 * scanner.nextDouble()  - reads a double value
 * scanner.next()        - reads a single word (stops at space)
 * scanner.nextLine()    - reads an entire line (including spaces)
 * scanner.nextBoolean() - reads true or false
 */
