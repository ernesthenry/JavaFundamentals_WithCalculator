package Basics;

/**
 * VARIABLES, SCOPE, AND LIFETIME
 * From Module 2: Understanding how variables work in Java
 * 
 * KEY CONCEPTS:
 * - Variable declaration
 * - Initialization
 * - Scope (visibility)
 * - Lifetime (how long variable exists)
 */
public class VariablesAndScope {
    
    // ================================================
    // CLASS-LEVEL VARIABLES (Instance Variables)
    // Scope: Entire class
    // Lifetime: As long as object exists
    // ================================================
    private int classVariable = 100;
    private String className = "VariablesAndScope";
    
    public static void main(String[] args) {
        
        System.out.println("=== VARIABLES IN JAVA ===\n");
        
        // ================================================
        // 1. BASIC VARIABLE DECLARATION
        // ================================================
        
        System.out.println("--- Variable Declaration ---\n");
        
        // Syntax: type identifier;
        int x;
        x = 10;  // Assignment after declaration
        System.out.println("x = " + x);
        
        // Declaration with initialization
        int y = 20;
        System.out.println("y = " + y);
        
        // Multiple variables of same type
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        System.out.println("Multiple: a=" + a + ", b=" + b + ", c=" + c);
        
        // Multiple declarations with initialization
        int d = 3, e, f = 5;
        e = 4;
        System.out.println("Mixed: d=" + d + ", e=" + e + ", f=" + f + "\n");
        
        // ================================================
        // 2. VARIABLE TYPES AND INITIALIZATION
        // ================================================
        
        System.out.println("--- Different Data Types ---\n");
        
        byte byteVar = 22;
        short shortVar = 1000;
        int intVar = 50000;
        long longVar = 1000000L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar + "\n");
        
        // ================================================
        // 3. SCOPE: BLOCK-LEVEL SCOPE
        // ================================================
        
        System.out.println("--- Variable Scope (Block Level) ---\n");
        
        int outerVar = 100;
        System.out.println("Outer variable: " + outerVar);
        
        // New block creates new scope
        {
            int innerVar = 200;  // Only exists in this block
            System.out.println("Inner variable: " + innerVar);
            System.out.println("Can access outer variable: " + outerVar);
            
            // Can modify outer variable
            outerVar = 150;
            System.out.println("Modified outer variable: " + outerVar);
        }
        // innerVar does NOT exist here - it's out of scope
        // System.out.println(innerVar);  // ERROR: Cannot resolve symbol
        
        System.out.println("After block, outer variable: " + outerVar + "\n");
        
        // ================================================
        // 4. SCOPE IN IF STATEMENTS
        // ================================================
        
        System.out.println("--- Scope in If Statements ---\n");
        
        int score = 85;
        
        if (score >= 50) {
            String result = "Pass";  // result only exists in this if block
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);
        }
        // System.out.println(result);  // ERROR: result is out of scope
        
        // Variable declared before if is accessible everywhere
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else {
            grade = "C";
        }
        System.out.println("Grade: " + grade + "\n");  // Works!
        
        // ================================================
        // 5. SCOPE IN LOOPS
        // ================================================
        
        System.out.println("--- Scope in Loops ---\n");
        
        // Loop variable scope
        for (int i = 0; i < 3; i++) {
            int loopVar = i * 10;  // New loopVar each iteration
            System.out.println("Loop iteration " + i + ", loopVar = " + loopVar);
        }
        // i and loopVar do NOT exist here
        // System.out.println(i);  // ERROR: Cannot resolve symbol
        
        // Variable declared before loop
        int sum = 0;
        for (int j = 1; j <= 5; j++) {
            sum += j;
        }
        System.out.println("Sum after loop: " + sum + "\n");  // Works!
        
        // ================================================
        // 6. VARIABLE SHADOWING (Same name, different scopes)
        // ================================================
        
        System.out.println("--- Variable Shadowing ---\n");
        
        int number = 10;
        System.out.println("Outer number: " + number);
        
        {
            int number2 = 20;  // Different name - OK
            System.out.println("Inner number2: " + number2);
            
            // int number = 30;  // ERROR: Variable 'number' already defined
            // Cannot have same variable name in nested scope
        }
        
        // But can reuse name in separate block
        {
            int number2 = 50;  // OK - different block
            System.out.println("Different block number2: " + number2);
        }
        
        System.out.println();
        
        // ================================================
        // 7. LIFETIME OF VARIABLES
        // ================================================
        
        System.out.println("--- Variable Lifetime ---\n");
        
        demonstrateLifetime();
        
        // ================================================
        // 8. VARIABLE NAMING RULES (Identifiers)
        // ================================================
        
        System.out.println("\n--- Valid Variable Names ---\n");
        
        // Valid identifiers
        int avgTemp = 72;
        int count = 10;
        int a4 = 100;
        int $test = 50;
        int this_is_ok = 25;
        int _underscore = 30;
        
        System.out.println("avgTemp: " + avgTemp);
        System.out.println("count: " + count);
        System.out.println("a4: " + a4);
        System.out.println("$test: " + $test);
        System.out.println("this_is_ok: " + this_is_ok);
        System.out.println("_underscore: " + _underscore);
        
        // Invalid identifiers (would cause compilation errors):
        // int 2count;      // Cannot start with number
        // int high-temp;   // Cannot use hyphen
        // int Not/ok;      // Cannot use slash
        
        System.out.println("\nREMEMBER: Java is CASE-SENSITIVE!");
        int Value = 10;
        int value = 20;
        int VALUE = 30;
        System.out.println("Value=" + Value + ", value=" + value + ", VALUE=" + VALUE);
    }
    
    /**
     * Demonstrates variable lifetime
     */
    static void demonstrateLifetime() {
        System.out.println("Method called - variables created");
        
        int methodVar = 100;
        System.out.println("methodVar = " + methodVar);
        
        for (int i = 0; i < 2; i++) {
            int loopVar = i;
            System.out.println("  Loop " + i + ": loopVar created = " + loopVar);
        }
        // loopVar destroyed after loop ends
        
        System.out.println("Method ending - methodVar will be destroyed");
        // methodVar destroyed when method ends
    }
    
    /**
     * Example showing class-level vs method-level variables
     */
    public void demonstrateInstanceVariables() {
        System.out.println("\n--- Instance Variables vs Local Variables ---\n");
        
        // Access class-level variable
        System.out.println("Class variable: " + classVariable);
        System.out.println("Class name: " + className);
        
        // Local variable
        int localVar = 50;
        System.out.println("Local variable: " + localVar);
        
        // Modify class variable
        classVariable = 200;
        System.out.println("Modified class variable: " + classVariable);
    }
}

/*
 * SCOPE AND LIFETIME SUMMARY FOR EXAM:
 * ======================================
 * 
 * 1. BLOCK SCOPE:
 *    - Variables declared in { } only exist within those braces
 *    - Includes: if blocks, loop blocks, method blocks, standalone blocks
 *    - Cannot access variable outside its block
 * 
 * 2. VARIABLE LIFETIME:
 *    - Variable created when declaration is executed
 *    - Variable destroyed when block ends
 *    - Class-level variables exist as long as object exists
 *    - Method-level variables destroyed when method returns
 * 
 * 3. VARIABLE DECLARATION RULES:
 *    - Must declare before use
 *    - Syntax: type identifier [= value];
 *    - Can declare multiple: int a, b, c;
 *    - Can initialize some: int d = 3, e, f = 5;
 * 
 * 4. IDENTIFIER RULES (Variable Names):
 *    ✅ Can use: Letters, digits, underscore (_), dollar sign ($)
 *    ✅ Can start with: Letter, underscore, dollar sign
 *    ❌ Cannot start with: Digit
 *    ❌ Cannot use: Reserved keywords, spaces, special characters
 *    ❌ Case-sensitive: Value ≠ value ≠ VALUE
 * 
 * 5. SCOPE CATEGORIES IN JAVA:
 *    - Class scope (instance variables)
 *    - Method scope (parameters and local variables)
 *    - Block scope (variables in { })
 *    - Loop scope (loop variables)
 * 
 * 
 * EXAM TIPS:
 * ===========
 * ✅ Variables must be declared before use
 * ✅ Block { } creates new scope
 * ✅ Inner blocks can access outer variables
 * ✅ Outer blocks CANNOT access inner variables
 * ✅ Variable exists only within its scope
 * ✅ Cannot redeclare same variable in nested scope
 * ✅ Java is case-sensitive (count ≠ Count)
 * ✅ Strongly typed - type must match or be compatible
 * 
 * 
 * COMMON EXAM QUESTIONS:
 * =======================
 * Q: What is scope?
 * A: Determines what objects are visible to other parts of program
 * 
 * Q: What is lifetime?
 * A: How long a variable exists in memory
 * 
 * Q: Can you access a variable declared inside an if block outside it?
 * A: No, it's out of scope
 * 
 * Q: What makes a valid identifier?
 * A: Letters, digits, _, $ but cannot start with digit
 */