# Object-Oriented Programming (OOP) - Complete Study Guide

## Module 1: OOP Fundamentals

---

## 1. TWO PROGRAMMING PARADIGMS

### Process-Oriented Model (Procedural)
- **Focus**: "What is happening" - organized around CODE
- **Approach**: Series of linear steps (code acting on data)
- **Example**: C language
- **Problem**: Becomes difficult to manage as programs grow larger

### Object-Oriented Model
- **Focus**: "Who is being affected" - organized around DATA
- **Approach**: Data controlling access to code
- **Benefits**: Better organization, easier to manage complexity
- **Key Idea**: Objects describe their own unique behavior

---

## 2. ABSTRACTION

### Definition
Managing complexity by thinking of systems as well-defined objects rather than individual parts.

### Real-World Example: CAR
- **Outside view**: Single object with unique behavior
- **Inside view**: Multiple subsystems (steering, brakes, sound system)
- **Deeper level**: Each subsystem has specialized units (radio, CD player)

### In Programming
- Transform traditional process steps into objects
- Process steps become messages between objects
- Each object responds to messages telling it to do something

### Key Benefits
- Manages complexity through hierarchical classifications
- Creates programs that survive changes over time
- Allows graceful replacement of parts without breaking the system

---

## 3. THE THREE OOP PRINCIPLES

### A. ENCAPSULATION

**Definition**: Binds together code and data, keeping both safe from outside interference

**Real-World Example**: Automatic Transmission
- Encapsulates hundreds of bits of information
- You interact through ONE interface: gear-shift lever
- Can't affect transmission with turn signal or wipers
- What happens inside doesn't affect outside objects
- All manufacturers implement differently, but interface is the same

**In Java**:
- **Class**: Basis of encapsulation
- **Members**: Data and code that constitute a class
  - **Member variables** (instance variables): The data
  - **Member methods** (methods): The code operating on data
- **Access Modifiers**:
  - `public`: Accessible from anywhere
  - `private`: Only accessible within the class

**Key Points**:
```java
public class Car {
    private int speed;        // private data
    private String model;     // hidden from outside
    
    public void accelerate() { // public method
        speed += 10;          // controlled access to data
    }
    
    public int getSpeed() {   // public interface
        return speed;
    }
}
```

---

### B. INHERITANCE

**Definition**: Process by which one object acquires properties of another object

**Purpose**: Supports hierarchical classification

**Real-World Example**: Animal Hierarchy
```
Animal (general)
  ↓
Mammal (more specific)
  ↓
Dog (most specific)
```

**Key Terms**:
- **Superclass**: Parent class (e.g., Animal)
- **Subclass**: Child class (e.g., Mammal)
- **Inheritance**: Subclass inherits all attributes from superclass

**Benefits**:
- Object only defines qualities that make it unique
- Inherits general attributes from parent
- Avoids redundant code
- Makes one object a specific instance of a general case

**Example in Java**:
```java
class Animal {
    int size;
    void eat() { }
    void sleep() { }
}

class Mammal extends Animal {
    String teethType;
    boolean hasMammaryGlands;
    // Inherits: size, eat(), sleep()
}

class Dog extends Mammal {
    String breed;
    // Inherits: size, teethType, hasMammaryGlands, eat(), sleep()
}
```

---

### C. POLYMORPHISM

**Definition**: "Many forms" - one interface used for a general class of actions

**Phrase**: "One interface, multiple methods"

**Real-World Example**: Dog's Sense of Smell
- **Same sense**: Smell
- **Different reactions**:
  - Smells cat → barks and chases
  - Smells food → salivates and runs to bowl
- **Key**: Different behavior based on data type (what's being smelled)

**Programming Example**: Stack Implementation
- Need stacks for: integers, floats, characters
- Same algorithm for all three
- In non-OOP: Need three different sets of routines with different names
- In OOP (polymorphism): One set of stack routines, same names

**Benefits**:
- Reduces complexity
- Same interface for related activities
- Compiler selects specific action automatically
- Users only remember general interface

---

## 4. HOW THE THREE PRINCIPLES WORK TOGETHER

### Combined Power
- **Encapsulation**: Migrate implementations without breaking dependent code
- **Inheritance**: Reuse code in class hierarchy
- **Polymorphism**: Create clean, readable, resilient code

### Car Example (Complete Illustration)
1. **Inheritance**: All drivers can operate different vehicles (bus, sedan, minivan) because they understand the common superclass
2. **Encapsulation**: Brake and gas pedals hide complexity with simple interface
3. **Polymorphism**: Same car, different options (antilock vs traditional brakes, different engines) - same interface, different implementations

---

## 5. LEXICAL ISSUES

### Whitespace
- Java is **free-form** language
- No special indentation rules required
- Whitespace = space, tab, or newline
- At least one whitespace needed between tokens

### Separators
Common separators in Java:

| Symbol | Name | Usage |
|--------|------|-------|
| `;` | Semicolon | Terminates statements |
| `()` | Parentheses | Method parameters, expressions |
| `{}` | Braces | Code blocks, class/method bodies |
| `[]` | Brackets | Array declarations and access |
| `,` | Comma | Separates items in lists |
| `.` | Period | Separates package/class names |

### Keywords (50 Total)
Reserved words that cannot be used as identifiers:

**Common keywords**:
- `class`, `public`, `private`, `static`, `void`
- `if`, `else`, `switch`, `case`, `default`
- `for`, `while`, `do`
- `int`, `float`, `double`, `char`, `boolean`
- `true`, `false`, `null` (reserved values)

**Special reserved**: `const`, `goto` (reserved but not used)

### Identifiers
Rules for naming variables, classes, methods:

**Valid**:
- Letters, numbers, underscore (_), dollar sign ($)
- Cannot start with a number
- Case-sensitive

**Examples**:
- ✅ Valid: `AvgTemp`, `count`, `a4`, `$test`, `this_is_ok`
- ❌ Invalid: `2count`, `high-temp`, `Not/ok`

---

## 6. FIRST JAVA PROGRAM STRUCTURE

```java
/* Multiline comment
   Can span multiple lines */

// Single-line comment

class Example {  // Class declaration
    
    public static void main(String args[]) {  // Main method
        System.out.println("Output text");     // Statement
    }
}
```

### Key Components:

1. **Comments**:
   - `/* */` - Multiline
   - `//` - Single line
   - `/** */` - Documentation (generates HTML)

2. **Class Declaration**:
   - `class ClassName { }`
   - Filename must match class name (Example.java)
   - Case-sensitive

3. **Main Method**:
   - Entry point of program
   - Signature: `public static void main(String args[])`
   - `public` - accessible from anywhere
   - `static` - called without creating object
   - `void` - doesn't return value
   - `String args[]` - command-line arguments

4. **Statements**:
   - End with semicolon (`;`)
   - `System.out.println()` - prints with newline
   - `System.out.print()` - prints without newline

---

## EXAM PREPARATION TIPS

### Must Know:
1. ✅ Define and explain three OOP principles
2. ✅ Give real-world examples of each principle
3. ✅ Understand how they work together
4. ✅ Know difference between process-oriented and OOP
5. ✅ Understand abstraction and hierarchical classification
6. ✅ Remember Java keywords and identifier rules
7. ✅ Know comment types and when to use each
8. ✅ Understand main method signature and why each part is needed

### Common Exam Questions:
- "Explain encapsulation with a real-world example"
- "What is inheritance and why is it important?"
- "Define polymorphism and give an example"
- "What are the three OOP principles?"
- "Explain the main method signature"
- "What is the difference between public and private?"

---

## QUICK REFERENCE

**OOP = Encapsulation + Inheritance + Polymorphism**

| Principle | Key Idea | Real Example |
|-----------|----------|--------------|
| Encapsulation | Data hiding + controlled access | Car transmission |
| Inheritance | Acquiring properties from parent | Animal → Mammal → Dog |
| Polymorphism | One interface, multiple forms | Dog's sense of smell |
