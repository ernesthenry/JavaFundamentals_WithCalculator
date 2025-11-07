# Complete Java Exam Study Guide
## Dr. A.R. Ajiboye - MCS 7205

---

# TABLE OF CONTENTS

1. [Module 1: OOP Concepts](#module-1)
2. [Module 2: Data Types & Variables](#module-2)
3. [Control Structures (If/Switch)](#control-structures)
4. [Reading Input (Scanner)](#reading-input)
5. [Algorithms (Bubble Sort)](#algorithms)
6. [Quick Reference Tables](#quick-reference)
7. [Exam Tips & Common Questions](#exam-tips)

---

<a id="module-1"></a>
# MODULE 1: OBJECT-ORIENTED PROGRAMMING

## Two Programming Paradigms

### 1. Process-Oriented (Procedural)
- **Organization**: Around CODE (what is happening)
- **Model**: Code acting on data
- **Example**: C language
- **Problem**: Hard to manage as programs grow

### 2. Object-Oriented (OOP)
- **Organization**: Around DATA (who is being affected)
- **Model**: Data controlling access to code
- **Benefits**: Better organization, manages complexity
- **Principle**: Objects have data and behavior together

---

## Abstraction

**Definition**: Managing complexity by viewing systems as well-defined objects

**Example**: Car
- Don't think of 10,000 parts
- Think of one object with unique behavior
- Ignore internal details (engine, transmission)
- Use hierarchical classification (car → subsystems → units)

**In Programming**:
- Traditional data → Objects
- Process steps → Messages between objects
- Each object describes its own behavior

---

## THE THREE OOP PRINCIPLES (CRITICAL FOR EXAM!)

### 1. ENCAPSULATION

**Definition**: Binds code and data together; protects from outside interference

**Real-World Analogy**: Automatic Transmission
- Encapsulates hundreds of bits of information
- ONE interface: gear-shift lever
- Can't affect with turn signal/wipers
- Internal changes don't affect external objects
- All manufacturers implement differently, but interface same

**In Java**:
```java
public class Car {
    private int speed;           // PRIVATE data (hidden)
    private String model;        // Protected from outside
    
    public void accelerate() {   // PUBLIC method (interface)
        speed += 10;             // Controlled access
    }
    
    public int getSpeed() {      // PUBLIC getter
        return speed;
    }
}
```

**Key Terms**:
- **Class**: Basis of encapsulation; defines structure and behavior
- **Object**: Instance of a class; physical reality
- **Member variables**: Data defined by class (instance variables)
- **Member methods**: Code operating on data (methods/functions)
- **public**: Accessible from anywhere (external interface)
- **private**: Only accessible within class (hidden implementation)

**Benefits**:
- Data is protected
- Controlled access through methods
- Can change implementation without breaking code
- Prevents improper actions

---

### 2. INHERITANCE

**Definition**: One object acquires properties of another object

**Purpose**: Supports hierarchical classification; code reuse

**Real-World Example**: Animal Hierarchy
```
Animal (general)
  - Attributes: size, intelligence
  - Behavior: eat, breathe, sleep
    ↓
Mammal (subclass of Animal)
  - Inherits: All Animal attributes
  - Adds: teeth type, mammary glands
    ↓
Dog (subclass of Mammal)
  - Inherits: All Animal + Mammal attributes
  - Adds: breed
```

**Key Terms**:
- **Superclass**: Parent class (e.g., Animal)
- **Subclass**: Child class (e.g., Dog)
- **extends**: Keyword for inheritance

**In Java**:
```java
class Animal {
    void eat() { }
    void sleep() { }
}

class Dog extends Animal {
    void bark() { }
    // Inherits: eat(), sleep()
}
```

**Benefits**:
- Object defines only unique qualities
- Inherits general attributes from parent
- Avoids code duplication
- Supports hierarchical classification
- Makes object a specific instance of general case

---

### 3. POLYMORPHISM

**Definition**: "Many forms" - one interface for general class of actions

**Phrase**: "One interface, multiple methods"

**Real-World Example**: Dog's Sense of Smell
- **Same mechanism**: Sense of smell
- **Different reactions**:
  - Smells cat → barks, chases
  - Smells food → salivates, runs to bowl
- **Key**: Same interface, different behavior based on data

**Programming Example**: Stack
- Need stacks for: int, float, char
- Same algorithm for all
- **Without polymorphism**: Three different function names
- **With polymorphism**: One name for all types

**Benefits**:
- Reduces complexity
- Same interface for related activities
- Compiler selects specific action
- Users remember only general interface

---

## How OOP Principles Work Together

**Car Example** (Complete illustration):
1. **Inheritance**: All drivers operate different vehicles (bus, sedan, minivan)
2. **Encapsulation**: Brake/gas pedals hide complexity; simple interface
3. **Polymorphism**: Same car, different options; same interface

**Result**: Robust, maintainable, scalable programs

---

<a id="module-2"></a>
# MODULE 2: DATA TYPES, VARIABLES, ARRAYS

## Java is Strongly Typed

**Meaning**:
1. Every variable has a type
2. Every expression has a type
3. All assignments checked for type compatibility
4. No automatic conversions of conflicting types

---

## 8 Primitive Data Types

### Four Groups:

#### 1. INTEGERS (Whole numbers, SIGNED)
| Type | Bits | Range | Usage |
|------|------|-------|-------|
| byte | 8 | -128 to 127 | Streams, binary data |
| short | 16 | -32,768 to 32,767 | Rarely used |
| **int** | 32 | -2.1B to 2.1B | **Most common** |
| long | 64 | Very large | Big numbers |

**Key Points**:
- All integers are SIGNED (positive and negative)
- Java does NOT support unsigned integers
- **int** is most commonly used (loops, arrays)
- Use **L** suffix for long: `1000000L`

#### 2. FLOATING-POINT (Decimal numbers)
| Type | Bits | Usage |
|------|------|-------|
| float | 32 | Dollars/cents, when memory matters |
| **double** | 64 | **Recommended** for all decimals |

**Key Points**:
- Use **f** suffix for float: `5.5f`
- **double** is default choice (more precise)
- Math functions (sin, cos, sqrt) return double
- Use double for iterative calculations

#### 3. CHARACTER
| Type | Bits | Range |
|------|------|-------|
| char | 16 | 0 to 65,535 (Unicode) |

**Key Points**:
- Uses UNICODE (not just ASCII)
- Represents any character in any language
- Use **single quotes**: `'A'`, `'x'`, `'5'`
- ASCII (0-127) still works

#### 4. BOOLEAN
| Type | Values |
|------|--------|
| boolean | true or false ONLY |

**Key Points**:
- Used for conditions, flags
- Returned by relational operators (`<`, `>`, `==`)
- Controls if/while/for statements

---

## Variables

### Declaration Syntax
```java
type identifier [= value];
```

### Examples
```java
int x;                    // Declaration
x = 10;                   // Assignment

int y = 20;              // Declaration with initialization

int a, b, c;             // Multiple variables
int d = 3, e, f = 5;     // Some initialized
```

### Valid Identifiers
**Rules**:
- Can use: Letters, digits, underscore (_), dollar ($)
- Cannot start with digit
- Case-sensitive
- Cannot be keywords

**Examples**:
- ✅ Valid: `avgTemp`, `count`, `a4`, `$test`, `this_is_ok`
- ❌ Invalid: `2count`, `high-temp`, `Not/ok`

---

## Scope and Lifetime

### Scope
**Definition**: Determines what objects are visible to other parts of program

### Block Scope
- Variables declared in `{ }` only exist within those braces
- Includes: if blocks, loops, methods, classes

```java
{
    int x = 10;  // exists in this block
}
// x does NOT exist here
```

### Lifetime
**Definition**: How long a variable exists in memory

- **Created**: When declaration executed
- **Destroyed**: When block ends
- **Class variables**: Exist as long as object exists
- **Method variables**: Destroyed when method returns

---

<a id="control-structures"></a>
# CONTROL STRUCTURES

## IF Statement

### Forms:

#### 1. Simple If
```java
if (condition) {
    // code
}
```

#### 2. If-Else
```java
if (condition) {
    // true block
} else {
    // false block
}
```

#### 3. If-Else-If Ladder
```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // default
}
```

### Operators:

**Relational**: `==`, `!=`, `>`, `<`, `>=`, `<=`

**Logical**: `&&` (AND), `||` (OR), `!` (NOT)

### Common Examples:

**Even/Odd**:
```java
if (num % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

**Leap Year** (from lecture):
```java
if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
    System.out.println("Leap year");
} else {
    System.out.println("Not leap year");
}
```

---

## SWITCH Statement

### Syntax:
```java
switch(variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

### Key Features:
- Works with: byte, short, char, int, String, enums
- **break** prevents fall-through
- **default** executes when no match
- Multiple cases can share code

### Vowel/Consonant (from lecture):
```java
switch(ch) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}
```

---

## IF vs SWITCH Comparison

| Feature | IF | SWITCH |
|---------|-----|--------|
| Conditions | Complex (>, <, &&) | Equality only |
| Data types | Any | Limited |
| Performance | Slower | Faster |
| Readability | Harder | Cleaner |
| Flexibility | High | Low |

**Use IF**: Complex conditions, ranges, boolean

**Use SWITCH**: Single variable, multiple fixed values

---

<a id="reading-input"></a>
# READING INPUT (Scanner)

## Setup
```java
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
```

## Methods
| Method | Type | Example |
|--------|------|---------|
| nextByte() | byte | Age |
| nextInt() | int | Number |
| nextFloat() | float | Price |
| nextDouble() | double | Salary |
| nextLine() | String | Full text |
| next() | String | Single word |

## Example:
```java
System.out.print("Enter age: ");  // Use print not println
int age = scanner.nextInt();
System.out.println("You are: " + age);
```

## Important Notes:
- Use **print()** not println() for same-line input
- Match method to type (nextInt for int)
- Clear buffer before nextLine(): `scanner.nextLine();`
- Close when done: `scanner.close();`

---

<a id="algorithms"></a>
# BUBBLE SORT ALGORITHM

## Algorithm:
```java
static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

## How It Works:
1. Compare adjacent elements
2. Swap if left > right
3. Largest "bubbles" to end
4. Repeat until sorted

## Key Points:
- **Outer loop**: `i < n-1` (passes)
- **Inner loop**: `j < n-i-1` (comparisons)
- **Time**: O(n²)
- **Space**: O(1)

---

<a id="quick-reference"></a>
# QUICK REFERENCE TABLES

## Data Type Sizes
| Type | Bits | Min | Max |
|------|------|-----|-----|
| byte | 8 | -128 | 127 |
| short | 16 | -32,768 | 32,767 |
| int | 32 | -2.1B | 2.1B |
| long | 64 | -9.2E18 | 9.2E18 |
| float | 32 | ±3.4e-038 | ±3.4e+038 |
| double | 64 | ±1.7e-308 | ±1.7e+308 |
| char | 16 | 0 | 65,535 |
| boolean | - | true | false |

## Scanner Methods
```java
nextByte()    → byte
nextInt()     → int
nextFloat()   → float
nextDouble()  → double
next()        → String (word)
nextLine()    → String (line)
nextBoolean() → boolean
```

## Keywords (50 total)
`class`, `public`, `private`, `static`, `void`, `if`, `else`, `switch`, `case`, `default`, `for`, `while`, `do`, `int`, `float`, `double`, `char`, `boolean`, `true`, `false`, `null`, `extends`, `implements`, `return`, `break`, `continue`, `new`, `this`, `super`, `import`, `package`, etc.

---

<a id="exam-tips"></a>
# EXAM TIPS & COMMON QUESTIONS

## Must Memorize:

### OOP Principles (Explain Each):
1. **Encapsulation**: Binding code and data, hiding complexity
2. **Inheritance**: Acquiring properties from parent
3. **Polymorphism**: One interface, multiple methods

### Data Types:
- 8 primitive types and their categories
- int = 32 bits, most common
- double = 64 bits, recommended for decimals
- char = 16 bits, Unicode
- boolean = true/false only

### Control Structures:
- if-else syntax
- switch-case with break
- When to use each

### Scanner:
- Import statement
- Creating Scanner object
- Correct method for each type

### Bubble Sort:
- Nested loop structure
- Why n-1 and n-i-1
- Swapping technique

---

## Common Exam Questions

### Q: What are the three OOP principles?
**A**: Encapsulation, Inheritance, Polymorphism

### Q: Give real-world example of encapsulation
**A**: Car transmission - single interface (gear shift), hides complexity

### Q: What is inheritance?
**A**: Process where one object acquires properties of another; supports hierarchical classification

### Q: Define polymorphism
**A**: "Many forms" - one interface used for general class of actions; compiler selects specific method

### Q: What is a class?
**A**: Basis of encapsulation; defines structure (data) and behavior (code)

### Q: What is an object?
**A**: Instance of a class; physical reality created from blueprint

### Q: Difference between public and private?
**A**: public = accessible anywhere; private = class only

### Q: What are member variables?
**A**: Data defined by class (instance variables)

### Q: What are member methods?
**A**: Code that operates on data; defines behavior

### Q: How many primitive types in Java?
**A**: 8 (byte, short, int, long, float, double, char, boolean)

### Q: Most commonly used integer type?
**A**: int (32-bit)

### Q: Recommended floating-point type?
**A**: double (64-bit, more precise)

### Q: What is scope?
**A**: Determines what objects are visible to other parts of program

### Q: What is lifetime?
**A**: How long a variable exists in memory

### Q: When to use if vs switch?
**A**: if = complex conditions; switch = single variable, fixed values

### Q: Write bubble sort outer loop
**A**: `for (int i = 0; i < n - 1; i++)`

### Q: How to read integer input?
**A**: `Scanner scanner = new Scanner(System.in); int num = scanner.nextInt();`

---

## Common Mistakes to Avoid

❌ Forgetting semicolons
❌ Using `=` instead of `==` in conditions
❌ Forgetting `break` in switch
❌ Wrong Scanner method for data type
❌ Starting identifier with digit
❌ Using keywords as variable names
❌ Accessing private variables from outside class
❌ Forgetting 'L' for long, 'f' for float
❌ Wrong loop bounds in bubble sort

---

## Final Checklist

- [ ] Can explain 3 OOP principles with examples
- [ ] Know all 8 primitive data types
- [ ] Remember data type sizes
- [ ] Understand class structure
- [ ] Know public vs private
- [ ] Can write if-else statement
- [ ] Can write switch-case statement
- [ ] Know when to use if vs switch
- [ ] Can use Scanner for input
- [ ] Can write bubble sort algorithm
- [ ] Understand variable scope and lifetime
- [ ] Know identifier rules
- [ ] Remember Java is case-sensitive
- [ ] Understand strongly typed language

---

**Good luck on your CAT! 📚✨**