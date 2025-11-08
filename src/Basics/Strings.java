package Basics;

/**
 * JAVA STRINGS - COMPLETE GUIDE
 * Strings are objects that represent sequences of characters
 * In Java, String is a class, not a primitive type
 * Strings are IMMUTABLE (cannot be changed after creation)
 */
public class Strings {
    public static void main(String[] args) {
        
        System.out.println("=== JAVA STRINGS COMPLETE GUIDE ===\n");
        
        // ================================================
        // 1. STRING CREATION
        // ================================================
        
        System.out.println("--- String Creation ---\n");
        
        // Method 1: String literal (most common)
        String str1 = "Hello, World!";
        System.out.println("String literal: " + str1);
        
        // Method 2: Using new keyword
        String str2 = new String("Hello, World!");
        System.out.println("Using new: " + str2);
        
        // Method 3: From char array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        System.out.println("From char array: " + str3);
        
        // Empty string
        String empty = "";
        System.out.println("Empty string: '" + empty + "'");
        System.out.println();
        
        // ================================================
        // 2. STRING LENGTH
        // ================================================
        
        System.out.println("--- String Length ---\n");
        
        String text = "Java Programming";
        System.out.println("Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Empty string length: " + empty.length());
        System.out.println();
        
        // ================================================
        // 3. STRING CONCATENATION
        // ================================================
        
        System.out.println("--- String Concatenation ---\n");
        
        // Using + operator
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        
        // Concatenating with numbers
        int age = 25;
        String message = "Age is " + age;
        System.out.println(message);
        
        // Using concat() method
        String str4 = "Hello";
        String str5 = " World";
        String result = str4.concat(str5);
        System.out.println("Using concat(): " + result);
        System.out.println();
        
        // ================================================
        // 4. ACCESSING CHARACTERS
        // ================================================
        
        System.out.println("--- Accessing Characters ---\n");
        
        String word = "Programming";
        
        // charAt() - get character at specific index
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
        System.out.println("Character at index 5: " + word.charAt(5));
        System.out.println();
        
        // ================================================
        // 5. STRING COMPARISON
        // ================================================
        
        System.out.println("--- String Comparison ---\n");
        
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";
        String s4 = new String("Java");
        
        // Using == (checks reference, NOT content)
        System.out.println("s1 == s2: " + (s1 == s2));  // true (same reference)
        System.out.println("s1 == s4: " + (s1 == s4));  // false (different reference)
        
        // Using equals() - CORRECT way to compare strings
        System.out.println("s1.equals(s2): " + s1.equals(s2));  // true
        System.out.println("s1.equals(s3): " + s1.equals(s3));  // false (case-sensitive)
        System.out.println("s1.equals(s4): " + s1.equals(s4));  // true (same content)
        
        // Using equalsIgnoreCase() - ignores case
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));  // true
        
        // Using compareTo() - returns int
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));  // 0 (equal)
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3));  // negative (s1 < s3)
        System.out.println();
        
        // ================================================
        // 6. STRING SEARCHING
        // ================================================
        
        System.out.println("--- String Searching ---\n");
        
        String sentence = "Java is a powerful programming language";
        
        // indexOf() - finds first occurrence
        int index1 = sentence.indexOf("a");
        System.out.println("First 'a' at index: " + index1);
        
        int index2 = sentence.indexOf("powerful");
        System.out.println("'powerful' starts at index: " + index2);
        
        // lastIndexOf() - finds last occurrence
        int index3 = sentence.lastIndexOf("a");
        System.out.println("Last 'a' at index: " + index3);
        
        // contains() - checks if substring exists
        boolean hasJava = sentence.contains("Java");
        boolean hasPython = sentence.contains("Python");
        System.out.println("Contains 'Java': " + hasJava);
        System.out.println("Contains 'Python': " + hasPython);
        
        // startsWith() and endsWith()
        System.out.println("Starts with 'Java': " + sentence.startsWith("Java"));
        System.out.println("Ends with 'language': " + sentence.endsWith("language"));
        System.out.println();
        
        // ================================================
        // 7. EXTRACTING SUBSTRINGS
        // ================================================
        
        System.out.println("--- Extracting Substrings ---\n");
        
        String original = "Hello World";
        
        // substring(startIndex) - from start to end
        String sub1 = original.substring(6);
        System.out.println("From index 6: " + sub1);  // "World"
        
        // substring(startIndex, endIndex) - from start to end-1
        String sub2 = original.substring(0, 5);
        System.out.println("From 0 to 5: " + sub2);  // "Hello"
        
        String sub3 = original.substring(6, 11);
        System.out.println("From 6 to 11: " + sub3);  // "World"
        System.out.println();
        
        // ================================================
        // 8. MODIFYING STRINGS (Creates new strings)
        // ================================================
        
        System.out.println("--- Modifying Strings ---\n");
        
        String original2 = "Hello World";
        
        // toLowerCase() and toUpperCase()
        System.out.println("Original: " + original2);
        System.out.println("Lower case: " + original2.toLowerCase());
        System.out.println("Upper case: " + original2.toUpperCase());
        
        // trim() - removes leading and trailing spaces
        String spacey = "   Hello World   ";
        System.out.println("With spaces: '" + spacey + "'");
        System.out.println("Trimmed: '" + spacey.trim() + "'");
        
        // replace() - replaces characters or substrings
        String text2 = "Java is fun";
        String replaced = text2.replace("fun", "awesome");
        System.out.println("Original: " + text2);
        System.out.println("Replaced: " + replaced);
        
        // replaceAll() - uses regex
        String text3 = "Hello123World456";
        String noDigits = text3.replaceAll("\\d", "");
        System.out.println("Without digits: " + noDigits);
        System.out.println();
        
        // ================================================
        // 9. SPLITTING STRINGS
        // ================================================
        
        System.out.println("--- Splitting Strings ---\n");
        
        String csv = "John,Doe,25,USA";
        String[] parts = csv.split(",");
        System.out.println("Original: " + csv);
        System.out.println("Split into parts:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("  Part " + i + ": " + parts[i]);
        }
        
        // Split by space
        String sentence2 = "Java is awesome";
        String[] words = sentence2.split(" ");
        System.out.println("\nWords in sentence:");
        for (String w : words) {
            System.out.println("  " + w);
        }
        System.out.println();
        
        // ================================================
        // 10. STRING FORMATTING
        // ================================================
        
        System.out.println("--- String Formatting ---\n");
        
        // Using String.format()
        String name = "Alice";
        int score = 95;
        double percentage = 95.5;
        
        String formatted1 = String.format("Name: %s, Score: %d", name, score);
        System.out.println(formatted1);
        
        String formatted2 = String.format("Percentage: %.2f%%", percentage);
        System.out.println(formatted2);
        
        // Using printf() directly
        System.out.printf("Name: %s, Age: %d, Grade: %.1f%n", "Bob", 20, 88.7);
        System.out.println();
        
        // ================================================
        // 11. CHECKING STRING PROPERTIES
        // ================================================
        
        System.out.println("--- String Properties ---\n");
        
        String test1 = "";
        String test2 = "   ";
        String test3 = "Hello";
        
        // isEmpty() - checks if length is 0
        System.out.println("Empty string isEmpty(): " + test1.isEmpty());
        System.out.println("Spaces isEmpty(): " + test2.isEmpty());
        System.out.println("Hello isEmpty(): " + test3.isEmpty());
        
        // isBlank() - checks if empty or only whitespace (Java 11+)
        System.out.println("Empty string isBlank(): " + test1.isBlank());
        System.out.println("Spaces isBlank(): " + test2.isBlank());
        System.out.println("Hello isBlank(): " + test3.isBlank());
        System.out.println();
        
        // ================================================
        // 12. STRING BUILDER (For Mutable Strings)
        // ================================================
        
        System.out.println("--- StringBuilder (Mutable) ---\n");
        
        // String is immutable - each operation creates new string
        String immutable = "Hello";
        immutable = immutable + " World";  // Creates new string
        System.out.println("Immutable result: " + immutable);
        
        // StringBuilder is mutable - modifies same object
        StringBuilder mutable = new StringBuilder("Hello");
        mutable.append(" World");  // Modifies existing object
        System.out.println("Mutable result: " + mutable.toString());
        
        // StringBuilder methods
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");           // Add to end
        sb.insert(5, "Advanced ");           // Insert at position
        sb.delete(5, 14);                    // Delete portion
        sb.reverse();                        // Reverse string
        System.out.println("After operations: " + sb.toString());
        System.out.println();
        
        // ================================================
        // 13. SPECIAL CHARACTERS (Escape Sequences)
        // ================================================
        
        System.out.println("--- Special Characters ---\n");
        
        // Common escape sequences
        System.out.println("New line: Hello\\nWorld");
        System.out.println("Hello\nWorld");
        
        System.out.println("\nTab: Hello\\tWorld");
        System.out.println("Hello\tWorld");
        
        System.out.println("\nBackslash: C:\\\\Users\\\\Name");
        System.out.println("C:\\Users\\Name");
        
        System.out.println("\nQuotes: He said \\\"Hello\\\"");
        System.out.println("He said \"Hello\"");
        
        System.out.println("\nSingle quote: It\\'s working");
        System.out.println("It's working");
        System.out.println();
        
        // ================================================
        // 14. PRACTICAL EXAMPLES
        // ================================================
        
        System.out.println("--- Practical Examples ---\n");
        
        // Example 1: Palindrome checker
        String palindrome = "radar";
        String reversed = new StringBuilder(palindrome).reverse().toString();
        boolean isPalindrome = palindrome.equals(reversed);
        System.out.println("Is '" + palindrome + "' a palindrome? " + isPalindrome);
        
        // Example 2: Count vowels
        String text4 = "Hello World";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text4.length(); i++) {
            if (vowels.indexOf(text4.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Vowels in '" + text4 + "': " + vowelCount);
        
        // Example 3: Word count
        String sentence3 = "Java is a powerful programming language";
        String[] wordArray = sentence3.split("\\s+");
        System.out.println("Word count in sentence: " + wordArray.length);
        
        // Example 4: Extract file extension
        String filename = "document.pdf";
        int dotIndex = filename.lastIndexOf(".");
        String extension = filename.substring(dotIndex + 1);
        System.out.println("File extension: " + extension);
    }
}

/*
 * STRING METHODS SUMMARY:
 * ========================
 * 
 * LENGTH & ACCESS:
 * - length()              → Get string length
 * - charAt(index)         → Get character at index
 * - isEmpty()             → Check if empty
 * - isBlank()             → Check if empty or whitespace
 * 
 * COMPARISON:
 * - equals(str)           → Compare content
 * - equalsIgnoreCase(str) → Compare ignoring case
 * - compareTo(str)        → Lexicographic comparison
 * - == operator           → Compare references (avoid!)
 * 
 * SEARCHING:
 * - indexOf(str)          → Find first occurrence
 * - lastIndexOf(str)      → Find last occurrence
 * - contains(str)         → Check if contains substring
 * - startsWith(str)       → Check if starts with
 * - endsWith(str)         → Check if ends with
 * 
 * EXTRACTION:
 * - substring(start)      → From start to end
 * - substring(start, end) → From start to end-1
 * - split(regex)          → Split into array
 * 
 * MODIFICATION (Creates new strings):
 * - toLowerCase()         → Convert to lowercase
 * - toUpperCase()         → Convert to uppercase
 * - trim()                → Remove leading/trailing spaces
 * - replace(old, new)     → Replace characters
 * - replaceAll(regex, new)→ Replace using regex
 * 
 * CONCATENATION:
 * - + operator            → Join strings
 * - concat(str)           → Join strings
 * - String.format()       → Format string
 * 
 * 
 * KEY CONCEPTS FOR EXAM:
 * =======================
 * 
 * 1. STRINGS ARE IMMUTABLE:
 *    - Cannot change after creation
 *    - Methods create new strings
 *    - Original string unchanged
 * 
 * 2. STRING vs StringBuilder:
 *    - String: Immutable, slower for many operations
 *    - StringBuilder: Mutable, faster for many operations
 * 
 * 3. STRING COMPARISON:
 *    - ALWAYS use equals(), NOT ==
 *    - == compares references
 *    - equals() compares content
 * 
 * 4. STRING INDEXING:
 *    - First character at index 0
 *    - Last character at index length-1
 *    - charAt() to access characters
 * 
 * 5. ESCAPE SEQUENCES:
 *    - \n  → New line
 *    - \t  → Tab
 *    - \\  → Backslash
 *    - \"  → Double quote
 *    - \'  → Single quote
 * 
 * 
 * COMMON EXAM QUESTIONS:
 * ======================
 * 
 * Q: How to compare strings in Java?
 * A: Use equals() method, not == operator
 * 
 * Q: Are strings mutable or immutable?
 * A: Immutable - cannot be changed after creation
 * 
 * Q: How to get string length?
 * A: Use length() method
 * 
 * Q: How to get character at position?
 * A: Use charAt(index) method
 * 
 * Q: What does substring(2, 5) return?
 * A: Characters from index 2 to 4 (5 is exclusive)
 * 
 * Q: When to use StringBuilder?
 * A: When making many string modifications (more efficient)
 * 
 * Q: What does split() return?
 * A: Array of strings
 * 
 * 
 * EXAM TIPS:
 * ===========
 * ✅ Remember: First index is 0
 * ✅ String methods don't change original (immutable)
 * ✅ Use equals() for comparison
 * ✅ substring(start, end) - end is exclusive
 * ✅ split() returns array of strings
 * ✅ Know escape sequences (\n, \t, \\, \")
 * ✅ Concatenation with + creates new string
 * ✅ StringBuilder for multiple modifications
 */