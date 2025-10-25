package Basics;

public class Variables {
    public static void main(String[] args) {
        System.out.println("=== Java Variables Examples ===\n");

        // VARIABLE TYPES IN JAVA:
        // String - stores text, surrounded by double quotes
        // int - stores whole numbers without decimals
        // float - stores numbers with decimals
        // char - stores single characters, surrounded by single quotes
        // boolean - stores true or false values

        // -----------------------------------
        // 1. STRING VARIABLE
        // -----------------------------------
        String name = "John";
        System.out.println("String variable: " + name);

        // -----------------------------------
        // 2. INT VARIABLE
        // -----------------------------------
        int myNum = 15;
        System.out.println("Int variable: " + myNum);

        // -----------------------------------
        // 3. DECLARE THEN ASSIGN
        // -----------------------------------
        int myNum2;
        myNum2 = 25;
        System.out.println("Declared then assigned: " + myNum2);

        // -----------------------------------
        // 4. CHANGING VARIABLE VALUES
        // -----------------------------------
        int myNum3 = 15;
        myNum3 = 20;  // myNum3 is now 20
        System.out.println("Changed value: " + myNum3);

        // -----------------------------------
        // 5. FINAL VARIABLES (Constants)
        // -----------------------------------
        final int myFinalNum = 15;
        // myFinalNum = 20;  // This would generate an error!
        System.out.println("Final variable (constant): " + myFinalNum);

        // -----------------------------------
        // 6. OTHER VARIABLE TYPES
        // -----------------------------------
        int myIntNum = 5;
        float myFloatNum = 5.99f;  // Note the 'f' at the end for float
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("\n=== All Variable Types ===");
        System.out.println("int: " + myIntNum);
        System.out.println("float: " + myFloatNum);
        System.out.println("char: " + myLetter);
        System.out.println("boolean: " + myBool);
        System.out.println("String: " + myText);
    }
}
