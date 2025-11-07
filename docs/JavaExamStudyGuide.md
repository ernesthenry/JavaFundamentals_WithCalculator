# Java Exam Study Guide - Dr. A.R. Ajiboye

## Quick Reference for Your CAT

---

## 1. READING INPUT (Scanner Class)

### Essential Import
```java
import java.util.Scanner;
```

### Basic Setup
```java
Scanner scanner = new Scanner(System.in);
```

### Scanner Methods
| Method | Data Type | Example |
|--------|-----------|---------|
| `nextByte()` | byte | Small integers (-128 to 127) |
| `nextInt()` | int | Whole numbers |
| `nextFloat()` | float | Decimal numbers |
| `nextDouble()` | double | Precise decimals |
| `nextLine()` | String | Full line of text |
| `next()` | String | Single word |

### Key Points for Exam
- Use **`print()`** instead of **`println()`** to keep input on same line
- Match the correct method to data type (e.g., `nextInt()` for integers)
- **Buffer issue**: After reading numbers, use `scanner.nextLine()` to clear buffer before reading strings
- **Type mismatch** causes `InputMismatchException`

---

## 2. IF STATEMENTS

### Basic Syntax
```java
if (condition) {
    // code executes if true
}
```

### If-Else
```java
if (condition) {
    // true block
} else {
    // false block
}
```

### If-Else-If Ladder
```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else if (condition3) {
    // code
} else {
    // default code
}
```

### Relational Operators
- `==` equal to
- `!=` not equal to
- `>` greater than
- `<` less than
- `>=` greater than or equal to
- `<=` less than or equal to

### Logical Operators
- `&&` AND (both must be true)
- `||` OR (at least one must be true)
- `!` NOT (inverts condition)

### Common Exam Examples

**Even or Odd:**
```java
if (num % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

**Leap Year (from lecture):**
```java
if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
    System.out.println("Leap year");
} else {
    System.out.println("Not a leap year");
}
```

---

## 3. SWITCH STATEMENTS

### Basic Syntax
```java
switch(variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code when no match
}
```

### Key Features
- Works with: **byte, short, char, int, String, enums**
- **`break`** prevents fall-through to next case
- **`default`** executes when no match found
- Multiple cases can share code:
  ```java
  case 'a':
  case 'e':
  case 'i':
      System.out.println("Vowel");
      break;
  ```

### Vowel/Consonant Example (from lecture)
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

## 4. IF vs SWITCH Comparison

| Feature | IF Statement | SWITCH Statement |
|---------|-------------|------------------|
| **Conditions** | Complex (>, <, &&, etc.) | Equality only (==) |
| **Data Types** | Any type | Limited (int, char, String, enum) |
| **Performance** | Slower with many conditions | Faster with many cases |
| **Readability** | Harder with many conditions | Cleaner and organized |
| **Flexibility** | Very flexible | Less flexible |

### When to Use What
- **Use IF**: Complex conditions, ranges, boolean expressions
- **Use SWITCH**: Single variable against multiple fixed values

---

## 5. BUBBLE SORT ALGORITHM

### The Algorithm
```java
static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

### How It Works
1. Compare adjacent elements
2. Swap if left > right
3. After each pass, largest element moves to end
4. Repeat until sorted

### Key Points for Exam
- **Outer loop**: `i < n - 1` (number of passes)
- **Inner loop**: `j < n - i - 1` (comparisons in each pass)
- **Swapping**: Use temp variable
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)

### Example Trace
Array: [5, 2, 8, 1]
- Pass 1: [2, 5, 1, 8] ← 8 bubbles to end
- Pass 2: [2, 1, 5, 8] ← 5 bubbles to position
- Pass 3: [1, 2, 5, 8] ← sorted!

---

## 6. IMPORTANT EXAM PATTERNS

### Pattern 1: Input Validation
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number: ");
int num = scanner.nextInt();

if (num > 0) {
    System.out.println("Positive");
} else if (num < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### Pattern 2: Menu-Driven Programs
```java
System.out.println("1. Option A");
System.out.println("2. Option B");
int choice = scanner.nextInt();

switch(choice) {
    case 1:
        // Option A code
        break;
    case 2:
        // Option B code
        break;
    default:
        System.out.println("Invalid choice");
}
```

### Pattern 3: Array Processing
```java
int[] arr = {1, 2, 3, 4, 5};

// Print array
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

---

## COMMON EXAM MISTAKES TO AVOID

❌ **Don't do this:**
- Forget semicolons (`;`)
- Misspell keywords (`System.out.println`)
- Use `=` instead of `==` in conditions
- Forget `break` in switch statements
- Mix up data types (int vs float)

✅ **Do this:**
- Always close Scanner: `scanner.close()`
- Use meaningful variable names
- Add comments to explain logic
- Test edge cases
- Remember proper syntax

---

## QUICK MEMORIZATION TIPS

1. **Scanner methods pattern**: `next` + `Type` (e.g., nextInt, nextFloat)
2. **Modulus operator** (`%`): Returns remainder (even/odd check)
3. **Break keyword**: Always needed in switch (except intentional fall-through)
4. **Leap year formula**: `(year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))`
5. **Bubble sort loops**: Outer `n-1`, Inner `n-i-1`

---

## EXAM DAY CHECKLIST

- [ ] Know Scanner import: `import java.util.Scanner;`
- [ ] Remember if-else syntax and braces
- [ ] Understand switch-case with break
- [ ] Know difference between if and switch
- [ ] Can write bubble sort from memory
- [ ] Understand modulus operator (%)
- [ ] Know logical operators (&&, ||, !)
- [ ] Can trace code execution step by step

---

**Good luck on your CAT! 🎓**
