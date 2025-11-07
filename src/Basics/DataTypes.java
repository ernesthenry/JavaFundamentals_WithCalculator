package Basics;

/**
 * MODULE 2: DATA TYPES, VARIABLES, AND ARRAYS
 * Java is a STRONGLY TYPED language - every variable has a type
 * All assignments are checked for type compatibility
 * 
 * 8 PRIMITIVE DATA TYPES:
 * 1. INTEGERS: byte, short, int, long
 * 2. FLOATING-POINT: float, double
 * 3. CHARACTER: char
 * 4. BOOLEAN: boolean
 */
public class DataTypes {
    public static void main(String[] args) {
        
        System.out.println("=== JAVA PRIMITIVE DATA TYPES ===\n");
        
        // ================================================
        // 1. INTEGER TYPES (Whole numbers, signed)
        // ================================================
        
        // BYTE: 8-bit, Range: -128 to 127
        // Used for: streams, raw binary data
        byte myByte = 100;
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println("--- BYTE ---");
        System.out.println("Value: " + myByte);
        System.out.println("Min: " + minByte + ", Max: " + maxByte);
        System.out.println("Size: 8 bits\n");
        
        // SHORT: 16-bit, Range: -32,768 to 32,767
        // Least used Java type
        short myShort = 20000;
        short minShort = -32768;
        short maxShort = 32767;
        System.out.println("--- SHORT ---");
        System.out.println("Value: " + myShort);
        System.out.println("Min: " + minShort + ", Max: " + maxShort);
        System.out.println("Size: 16 bits\n");
        
        // INT: 32-bit, Range: -2,147,483,648 to 2,147,483,647
        // MOST COMMONLY USED integer type
        // Used for: loops, array indexing, general calculations
        int myInt = 100000;
        int minInt = -2147483648;
        int maxInt = 2147483647;
        System.out.println("--- INT (Most Common) ---");
        System.out.println("Value: " + myInt);
        System.out.println("Min: " + minInt);
        System.out.println("Max: " + maxInt);
        System.out.println("Size: 32 bits\n");
        
        // LONG: 64-bit, very large range
        // Used for: big whole numbers (like scientific calculations)
        // NOTE: Use 'L' suffix for long literals
        long myLong = 15000000000L;  // Note the 'L' at the end
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;
        System.out.println("--- LONG ---");
        System.out.println("Value: " + myLong);
        System.out.println("Min: " + minLong);
        System.out.println("Max: " + maxLong);
        System.out.println("Size: 64 bits\n");
        
        // EXAMPLE: Light travel calculation (from lecture)
        long lightSpeed = 186000; // miles per second
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightSpeed * seconds;
        System.out.println("Light travels " + distance + " miles in " + days + " days\n");
        
        // ================================================
        // 2. FLOATING-POINT TYPES (Decimal numbers)
        // ================================================
        
        // FLOAT: 32-bit, single precision
        // Used for: fractional values, dollars and cents
        // NOTE: Use 'f' or 'F' suffix for float literals
        float myFloat = 19.99f;
        float highTemp = 98.6f;
        float lowTemp = 32.0f;
        System.out.println("--- FLOAT ---");
        System.out.println("Price: $" + myFloat);
        System.out.println("High temp: " + highTemp + "°F");
        System.out.println("Low temp: " + lowTemp + "°F");
        System.out.println("Size: 32 bits (single precision)\n");
        
        // DOUBLE: 64-bit, double precision
        // Used for: accurate calculations, math functions (sin, cos, sqrt)
        // DEFAULT choice for floating-point calculations
        double myDouble = 3.141592653589793;
        double radius = 10.8;
        double pi = 3.1416;
        double area = pi * radius * radius;
        System.out.println("--- DOUBLE (Recommended) ---");
        System.out.println("Pi value: " + myDouble);
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area);
        System.out.println("Size: 64 bits (double precision)\n");
        
        // ================================================
        // 3. CHARACTER TYPE
        // ================================================
        
        // CHAR: 16-bit, Unicode character
        // Range: 0 to 65,536 (unsigned)
        // Java uses UNICODE (not just ASCII)
        // NOTE: Use single quotes for char literals
        char myChar = 'A';
        char letter = 'x';
        char digit = '5';
        char symbol = '$';
        System.out.println("--- CHAR ---");
        System.out.println("Character: " + myChar);
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Size: 16 bits (Unicode)\n");
        
        // ASCII values (0-127) and extended ISO-Latin-1 (0-255) still work
        char asciiA = 65;  // 'A' in ASCII
        System.out.println("ASCII 65 is: " + asciiA + "\n");
        
        // ================================================
        // 4. BOOLEAN TYPE
        // ================================================
        
        // BOOLEAN: true or false only
        // Used for: conditions, flags, relational operations
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        boolean result = 10 > 9;
        System.out.println("--- BOOLEAN ---");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        System.out.println("10 > 9 is: " + result);
        System.out.println("Values: true or false only\n");
        
        // Boolean in control statements
        if (isJavaFun) {
            System.out.println("Java is fun! (controlled by boolean)\n");
        }
        
        // ================================================
        // VARIABLE DECLARATION EXAMPLES
        // ================================================
        
        System.out.println("=== VARIABLE DECLARATIONS ===\n");
        
        // Single declaration
        int a;
        a = 10;
        
        // Multiple declarations
        int b, c, d;
        
        // Declaration with initialization
        int e = 5, f = 10, g = 15;
        
        // Multiple variables, some initialized
        int h = 100, i, j = 200;
        
        System.out.println("Multiple int variables: e=" + e + ", f=" + f + ", g=" + g);
        
        // Mixed declarations
        byte z = 22;
        double piValue = 3.14159;
        char x = 'x';
        
        System.out.println("Mixed types: byte=" + z + ", double=" + piValue + ", char=" + x + "\n");
        
        // ================================================
        // TYPE COMPATIBILITY (Strongly Typed)
        // ================================================
        
        System.out.println("=== JAVA IS STRONGLY TYPED ===\n");
        
        int intNum = 10;
        // float floatNum = intNum;  // This works (int to float)
        
        // double dbl = 5.5;
        // int wrongInt = dbl;  // ERROR! Cannot assign double to int
        
        System.out.println("Every variable has a type");
        System.out.println("Every expression has a type");
        System.out.println("All assignments are type-checked");
        System.out.println("Type mismatches must be corrected!\n");
        
        // ================================================
        // IMPORTANT NOTES FOR EXAM
        // ================================================
        
        System.out.println("=== KEY POINTS FOR EXAM ===\n");
        System.out.println("1. Java defines exact size for each type (portability)");
        System.out.println("2. All integers are SIGNED (positive and negative)");
        System.out.println("3. int is most commonly used for whole numbers");
        System.out.println("4. double is recommended over float for decimals");
        System.out.println("5. char uses Unicode (16-bit), not just ASCII");
        System.out.println("6. boolean has only two values: true or false");
        System.out.println("7. Use 'f' suffix for float: 5.5f");
        System.out.println("8. Use 'L' suffix for long: 1000000L");
        System.out.println("9. Java is STRONGLY TYPED - types are checked");
    }
}

/*
 * DATA TYPE SIZES SUMMARY:
 * ========================
 * TYPE     | BITS | MIN VALUE              | MAX VALUE
 * ---------|------|------------------------|------------------
 * byte     | 8    | -128                   | 127
 * short    | 16   | -32,768                | 32,767
 * int      | 32   | -2,147,483,648         | 2,147,483,647
 * long     | 64   | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807
 * float    | 32   | ±3.4e-038              | ±3.4e+038
 * double   | 64   | ±1.7e-308              | ±1.7e+308
 * char     | 16   | 0                      | 65,535 (Unicode)
 * boolean  | -    | true                   | false
 * 
 * 
 * WHEN TO USE WHAT:
 * ==================
 * byte   - Streams, binary data, memory optimization
 * short  - Rarely used in modern Java
 * int    - DEFAULT for whole numbers, loops, array indices
 * long   - Very large whole numbers
 * float  - Dollars/cents, when memory matters
 * double - DEFAULT for decimals, math calculations
 * char   - Single characters
 * boolean- Conditions, flags, true/false values
 * 
 * 
 * EXAM TIP: Type Compatibility
 * =============================
 * ✅ ALLOWED:
 *    byte → short → int → long → float → double
 *    char → int
 * 
 * ❌ NOT ALLOWED without casting:
 *    Larger type → smaller type
 *    double → int
 *    float → int
 */