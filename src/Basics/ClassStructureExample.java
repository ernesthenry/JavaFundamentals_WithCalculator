package Basics;

/**
 * CLASS STRUCTURE IN JAVA
 * Demonstrating the structure discussed in Module 2
 * 
 * A CLASS is the basis of encapsulation in Java
 * Contains: data (member variables) and code (methods)
 */

// Example: COURSE class (from lecture diagram)
class Course {
    // ================================================
    // MEMBER VARIABLES (Instance Variables)
    // These are the DATA of the class
    // ================================================
    private String courseName;
    private String courseCode;
    private int credits;
    private String instructor;
    
    // ================================================
    // CONSTRUCTOR
    // Special method to initialize objects
    // ================================================
    public Course(String name, String code, int credits, String instructor) {
        this.courseName = name;
        this.courseCode = code;
        this.credits = credits;
        this.instructor = instructor;
    }
    
    // ================================================
    // MEMBER METHODS
    // These are the CODE that operates on the data
    // Define how member variables can be used
    // ================================================
    
    // PUBLIC methods - external interface
    public void displayCourseInfo() {
        System.out.println("=== Course Information ===");
        System.out.println("Course: " + courseName);
        System.out.println("Code: " + courseCode);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + instructor);
        System.out.println();
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    // PRIVATE method - internal use only
    private boolean isValidCredits() {
        return credits > 0 && credits <= 6;
    }
}

// ================================================
// DEMONSTRATING ENCAPSULATION
// ================================================
class BankAccount {
    // PRIVATE data - hidden from outside
    private double balance;
    private String accountNumber;
    private String ownerName;
    
    // Constructor
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    // PUBLIC interface - controlled access to data
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void displayAccountInfo() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }
}

// ================================================
// DEMONSTRATING INHERITANCE
// ================================================
class Animal {
    // Superclass (parent)
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    // Subclass (child) - inherits from Animal
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Unique method for Dog
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
    
    public void displayInfo() {
        System.out.println("Dog: " + name + ", Age: " + age + ", Breed: " + breed);
    }
}

// ================================================
// MAIN CLASS - TESTING ALL CONCEPTS
// ================================================
public class ClassStructureExample {
    public static void main(String[] args) {
        
        System.out.println("=== CLASS STRUCTURE IN JAVA ===\n");
        
        // ================================================
        // 1. CREATING AND USING OBJECTS
        // ================================================
        
        System.out.println("--- Creating Course Objects ---\n");
        
        // Create Course objects (instances of the class)
        Course java = new Course("Advanced Computer Programming", "MCS 7205", 3, "Dr. A.R. Ajiboye");
        Course math = new Course("Calculus", "MATH 101", 4, "Dr. Smith");
        
        // Use public methods to interact with objects
        java.displayCourseInfo();
        math.displayCourseInfo();
        
        // Cannot access private variables directly
        // System.out.println(java.courseName);  // ERROR: courseName is private
        
        // Must use public methods (getters)
        System.out.println("Accessing through public method:");
        System.out.println("Course name: " + java.getCourseName());
        System.out.println("Course code: " + java.getCourseCode() + "\n");
        
        // ================================================
        // 2. DEMONSTRATING ENCAPSULATION
        // ================================================
        
        System.out.println("--- Encapsulation Example: Bank Account ---\n");
        
        BankAccount account = new BankAccount("ACC123", "John Doe", 1000.0);
        account.displayAccountInfo();
        
        // Can only access balance through public methods
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current balance: $" + account.getBalance() + "\n");
        
        // Cannot directly access private data
        // account.balance = 10000;  // ERROR: balance is private
        
        System.out.println("ENCAPSULATION BENEFITS:");
        System.out.println("✓ Data is protected from outside interference");
        System.out.println("✓ Controlled access through public methods");
        System.out.println("✓ Can change internal implementation without breaking code");
        System.out.println("✓ Prevents invalid operations (e.g., negative deposits)\n");
        
        // ================================================
        // 3. DEMONSTRATING INHERITANCE
        // ================================================
        
        System.out.println("--- Inheritance Example: Animal → Dog ---\n");
        
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Using inherited methods from Animal
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        
        // Using Dog's own method
        myDog.bark();   // Unique to Dog
        
        myDog.displayInfo();
        
        System.out.println("\nINHERITANCE BENEFITS:");
        System.out.println("✓ Dog inherits all attributes and methods from Animal");
        System.out.println("✓ Dog only defines what makes it unique (breed, bark)");
        System.out.println("✓ Avoids code duplication");
        System.out.println("✓ Supports hierarchical classification\n");
        
        // ================================================
        // 4. CLASS MEMBERS SUMMARY
        // ================================================
        
        System.out.println("=== CLASS MEMBERS ===\n");
        System.out.println("1. MEMBER VARIABLES (Instance Variables):");
        System.out.println("   - The DATA defined by the class");
        System.out.println("   - Can be private (hidden) or public (visible)");
        System.out.println("   - Example: courseName, balance, age\n");
        
        System.out.println("2. MEMBER METHODS (Methods):");
        System.out.println("   - The CODE that operates on the data");
        System.out.println("   - Define how member variables can be used");
        System.out.println("   - Can be private (internal) or public (interface)");
        System.out.println("   - Example: deposit(), getBalance(), eat()\n");
        
        System.out.println("3. ACCESS MODIFIERS:");
        System.out.println("   - public: accessible from anywhere");
        System.out.println("   - private: only accessible within the class");
        System.out.println("   - protected: accessible in subclasses and same package\n");
    }
}

/*
 * CLASS STRUCTURE - KEY CONCEPTS FOR EXAM:
 * ==========================================
 * 
 * 1. WHAT IS A CLASS?
 *    - Basis of encapsulation in Java
 *    - Defines structure (data) and behavior (code)
 *    - Template for creating objects
 *    - Logical construct (blueprint)
 * 
 * 2. WHAT IS AN OBJECT?
 *    - Instance of a class
 *    - Physical reality (actual entity in memory)
 *    - Created using 'new' keyword
 *    - Example: Course java = new Course(...);
 * 
 * 3. CLASS MEMBERS:
 *    a) Member Variables (Instance Variables):
 *       - Data defined by the class
 *       - Represent state of object
 *       - Example: courseName, balance, age
 * 
 *    b) Member Methods (Methods):
 *       - Code that operates on data
 *       - Define behavior of object
 *       - Example: deposit(), getBalance(), bark()
 * 
 * 4. ENCAPSULATION IN CLASSES:
 *    - Binds data and code together
 *    - Hides complexity using access modifiers
 *    - public: external interface (what others see)
 *    - private: internal implementation (hidden)
 * 
 * 5. PUBLIC vs PRIVATE:
 *    PUBLIC:
 *    - Can be accessed from outside the class
 *    - Represents external interface
 *    - Methods users need to know about
 * 
 *    PRIVATE:
 *    - Can only be accessed within the class
 *    - Hides internal implementation
 *    - Protects data from misuse
 * 
 * 6. BENEFITS OF PROPER CLASS DESIGN:
 *    ✓ Encapsulation protects data
 *    ✓ Controlled access through methods
 *    ✓ Can change implementation without breaking code
 *    ✓ Prevents improper actions
 *    ✓ Supports inheritance and code reuse
 * 
 * 
 * EXAM TIPS:
 * ===========
 * Q: What is a class?
 * A: Defines structure and behavior; basis of encapsulation
 * 
 * Q: What is an object?
 * A: Instance of a class; physical reality
 * 
 * Q: What are member variables?
 * A: Data defined by class; instance variables
 * 
 * Q: What are member methods?
 * A: Code that operates on data; defines behavior
 * 
 * Q: Difference between public and private?
 * A: public = accessible everywhere; private = class only
 * 
 * Q: Why use private variables?
 * A: Hide implementation, protect data, prevent misuse
 * 
 * 
 * IMPORTANT TERMINOLOGY:
 * ======================
 * Class = Logical construct, blueprint
 * Object = Physical reality, instance
 * Member variables = Instance variables = Data
 * Member methods = Methods = Functions = Behavior
 * Instance = Object created from class
 * Instantiate = Create an object
 */