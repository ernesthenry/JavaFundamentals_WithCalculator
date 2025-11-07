# Java Fundamentals Project

This project contains Java fundamentals examples for the **Master of Computer Science Advanced Programming course unit (MCS 7205)** taught by **Dr. A.R. Ajiboye**.

Each folder corresponds to a major section of the Java programming curriculum, covering everything from basic syntax to advanced object-oriented programming concepts.

## 📚 Course Coverage

This repository includes comprehensive examples for:

### Module 1: Object-Oriented Programming (OOP)
- **OOP Principles:** Encapsulation, Inheritance, and Polymorphism
- **Abstraction concepts** and hierarchical classifications
- **Process-oriented vs Object-oriented** programming paradigms
- **Class structure:** Member variables, member methods, access modifiers
- **Real-world examples:** Car transmission, animal hierarchy, bank accounts

### Module 2: Data Types, Variables, and Arrays
- **8 Primitive Data Types:** byte, short, int, long, float, double, char, boolean
- **Strongly typed language** concepts
- **Variable declaration, initialization, and scope**
- **Lifetime of variables** and identifier rules
- **Type compatibility** and type checking

### Control Structures
- **If statements:** Simple if, if-else, if-else-if ladder
- **Switch statements:** Case handling, break keyword, fall-through
- **When to use if vs switch**
- **Relational and logical operators**
- **Common patterns:** Even/odd checker, leap year calculation

### Input/Output Operations
- **Scanner class** for reading user input
- **Reading different data types:** byte, int, float, double, String
- **System.out.println()** for output
- **Buffer handling** and common input issues

### Algorithms
- **Bubble Sort:** Complete implementation with optimization
- **Algorithm analysis:** Time and space complexity
- **Step-by-step tracing** and debugging techniques

## Getting Started

### Prerequisites

You'll need to have Java and Git installed on your computer.

- **Java JDK:** [Download Java](https://www.oracle.com/java/technologies/downloads/)
- **Git:** [Download Git](https://git-scm.com/downloads)

After installing Git, verify it's working by opening your terminal and typing:

```bash
git --version
```

### Cloning This Project

To get a copy of this project on your computer:

1. Open your terminal or command prompt
2. Navigate to where you want the project folder
3. Run this command:

```bash
git clone https://github.com/ernesthenry/JavaFundamentals_WithCalculator
```

4. Navigate into the project:

```bash
cd JavaFundamentals_WithCalculator
```

Now you have the project on your local machine!

## 📁 Project Structure

```
JavaFundamentals_WithCalculator/
├── src/
│   ├── Basics/
│   │   ├── Main.java                    # Hello World with comments
│   │   ├── Variables.java               # Variable types and usage
│   │   ├── DataTypes.java               # All 8 primitive types
│   │   ├── VariablesAndScope.java       # Scope and lifetime
│   │   ├── ReadingInput.java            # Scanner class examples
│   │   ├── IfStatement.java             # If/else control structures
│   │   ├── SwitchStatement.java         # Switch/case examples
│   │   ├── BubbleSort.java              # Sorting algorithm
│   │   └── ClassStructureExample.java   # OOP concepts demonstration
│   ├── Projects/
│   │   └── Calculator.java              # GUI Calculator application
│   └── docs/
│       ├── OOP_Study_Guide.md           # Module 1 study guide
│       └── Complete_Exam_Guide.md       # Comprehensive exam prep
└── README.md
```

## 🎯 Running Examples

### Basic Examples

#### Using Terminal:

```bash
# Compile a Java file
javac src/Basics/HelloWorld.java

# Run the compiled class
java -cp src Basics.HelloWorld
```

#### Running Specific Examples:

**Variables and Data Types:**
```bash
javac src/Basics/DataTypes.java
java -cp src Basics.DataTypes
```

**Reading Input (Scanner):**
```bash
javac src/Basics/ReadingInput.java
java -cp src Basics.ReadingInput
```

**Control Structures (If/Switch):**
```bash
javac src/Basics/IfStatement.java
java -cp src Basics.IfStatement

javac src/Basics/SwitchStatement.java
java -cp src Basics.SwitchStatement
```

**Bubble Sort Algorithm:**
```bash
javac src/Basics/BubbleSort.java
java -cp src Basics.BubbleSort
```

**OOP Concepts (Class Structure):**
```bash
javac src/Basics/ClassStructureExample.java
java -cp src Basics.ClassStructureExample
```

#### Using VS Code:
1. Open any `.java` file in the `src/Basics/` folder
2. Click the "Run" button or press `F5`
3. View output in the integrated terminal

## 🧮 Calculator Project - GUI Version

### Details

- **File:** `src/Projects/Calculator.java`
- **Package:** `Projects`
- **Type:** Graphical User Interface (GUI) Application using Java Swing

### Features

- **Modern GUI Interface** with color-coded buttons
- **Basic Operations:** Addition (+), Subtraction (-), Multiplication (×), Division (÷)
- **Scientific Functions:**
  - Trigonometry: sin, cos, tan (in degrees)
  - Roots & Powers: √ (square root), x^y (power), e^x (exponential)
  - Logarithms: log (base 10), ln (natural log)
  - Other: abs (absolute value)
- **History Panel:** Tracks all your calculations
- **Error Handling:** 
  - Division by zero protection
  - Domain validation (e.g., no negative square roots)
  - Invalid input handling
- **Visual Feedback:** Button hover effects and color coding
  - Numbers: Dark gray
  - Basic operators: Orange
  - Scientific functions: Blue
  - Clear button: Red

### Running the Calculator

#### Using Terminal:

```bash
javac src/Projects/Calculator.java
java -cp src Projects.Calculator
```

#### Using VS Code:
1. Open `src/Projects/Calculator.java`
2. Click the "Run" button or press `F5`

#### Using Command Line (Alternative):
```bash
cd src
javac Projects/Calculator.java
java Projects.Calculator
```

### How to Use the GUI Calculator

1. **Basic Calculations:**
   - Click number buttons to enter values
   - Click an operator (+, -, ×, ÷)
   - Enter second number
   - Click "=" to see result

2. **Scientific Functions:**
   - Enter a number
   - Click the desired function (sin, cos, √, etc.)
   - Result appears immediately

3. **Clear:**
   - Click "C" to clear everything and start fresh

4. **History:**
   - View all previous calculations in the history panel at the bottom
   - Automatically scrolls to show latest calculations

### Example Calculations

- **Basic:** `45 + 55 = 100`
- **Trigonometry:** `sin(90°) = 1.0`
- **Powers:** `2^10 = 1024`
- **Logarithm:** `log₁₀(100) = 2`
- **Square Root:** `√144 = 12`

## 📖 Study Materials

This repository includes comprehensive study guides for exam preparation:

### Quick Reference Guides

#### 1. OOP Concepts Study Guide (`docs/OOP_Study_Guide.md`)
- Two programming paradigms
- Abstraction and hierarchical classification
- Three OOP principles with real-world examples
- Class structure and encapsulation
- Inheritance and polymorphism

#### 2. Complete Exam Study Guide (`docs/Complete_Exam_Guide.md`)
- All 8 primitive data types with sizes and ranges
- Variable declaration and scope
- Control structures (if/switch) comparison
- Scanner methods reference table
- Bubble sort algorithm breakdown
- Common exam questions with answers
- Mistakes to avoid checklist

### Learning Path

**Week 1-2: Fundamentals**
1. Run `Main.java` - Understand basic program structure
2. Study `Variables.java` - Learn variable types
3. Practice with `DataTypes.java` - Master all 8 primitive types
4. Explore `VariablesAndScope.java` - Understand scope and lifetime

**Week 3-4: Input/Output & Control**
5. Master `ReadingInput.java` - Scanner class usage
6. Practice `IfStatement.java` - Conditional logic
7. Study `SwitchStatement.java` - Menu-driven programs
8. Compare if vs switch patterns

**Week 5-6: OOP & Algorithms**
9. Analyze `ClassStructureExample.java` - See OOP in action
10. Implement `BubbleSort.java` - Algorithm understanding
11. Read OOP Study Guide - Theoretical concepts
12. Review Complete Exam Guide - Prepare for assessment

## 🎓 Key Learning Objectives

By studying this repository, you will:

✅ Understand the three pillars of OOP (Encapsulation, Inheritance, Polymorphism)  
✅ Master Java's 8 primitive data types and when to use each  
✅ Write proper variable declarations with correct scope  
✅ Implement control structures (if-else, switch-case)  
✅ Read user input using Scanner class  
✅ Understand and implement bubble sort algorithm  
✅ Design classes with proper encapsulation  
✅ Build graphical user interfaces with Java Swing  
✅ Handle exceptions and errors gracefully  
✅ Write clean, well-commented, maintainable code  

## 💡 Technical Details

### Core Java Concepts Covered:
- **Object-Oriented Programming:** Classes, objects, inheritance, polymorphism
- **Data Types:** Primitive types, type casting, type compatibility
- **Control Flow:** if-else, switch-case, loops
- **Input/Output:** Scanner class, System.out methods
- **Algorithms:** Sorting, searching, complexity analysis
- **GUI Development:** Swing framework, event handling, layouts

### GUI Components Used (Calculator):
- **JFrame:** Main window container
- **JTextField:** Display field for showing numbers and results
- **JButton:** Interactive buttons for all operations
- **JTextArea:** History log with scrolling
- **GridLayout & BorderLayout:** Layout managers for organizing components

### Programming Best Practices:
- **Naming conventions:** camelCase for variables, PascalCase for classes
- **Access modifiers:** Proper use of public, private, protected
- **Code comments:** Explanatory comments for every major concept
- **Error handling:** Try-catch blocks for robust applications
- **Type safety:** Leveraging Java's strongly-typed nature

## 🤝 Contributing

We welcome contributions! Here's how you can help improve this project:

### Forking the Repository

1. Go to the GitHub repository page
2. Click the **Fork** button in the top-right corner
3. This creates a copy of the project in your GitHub account

### Making Changes

1. Clone your forked repository (see "Cloning This Project" above, but use your fork's URL)
2. Create a new branch for your changes:

```bash
git checkout -b my-new-feature
```

3. Make your changes to the code
4. Test your changes to make sure they work
5. Commit your changes:

```bash
git add .
git commit -m "Add a brief description of your changes"
```

6. Push your changes to your fork:

```bash
git push origin my-new-feature
```

### Submitting a Pull Request

1. Go to your fork on GitHub
2. Click **Pull Request** button
3. Click **New Pull Request**
4. Select your branch and provide a clear description of your changes
5. Submit the pull request

We'll review your contribution and provide feedback. Thank you for helping make this project better!

### Contribution Guidelines

- Keep examples simple and well-commented
- Follow Java naming conventions (camelCase, PascalCase)
- Test your code before submitting
- Add study notes for new concepts
- For GUI changes, ensure cross-platform compatibility
- Include screenshots for visual changes
- Update relevant study guides with new content
- Add examples that align with course curriculum
- Include a clear description of what your contribution does

### Areas for Contribution

**Learning Examples:**
- Additional algorithm implementations
- More OOP pattern examples
- Practice problems with solutions
- Interactive coding exercises

**Documentation:**
- More detailed explanations
- Additional real-world examples
- Video tutorial links
- Practice exam questions

**Calculator Enhancements:**
- Keyboard input support
- Memory functions (M+, M-, MR, MC)
- More scientific functions
- Themes/dark mode

## 🔧 Troubleshooting

### Common Issues and Solutions

#### Calculator window doesn't appear:
- Make sure you have Java JDK installed (not just JRE)
- Verify your JAVA_HOME environment variable is set correctly
- Try running with: `java -version` to confirm Java is installed

#### Compilation errors:
- Ensure you're in the correct directory
- Check that the package structure matches the file location
- Make sure all files are saved before compiling
- Verify class names match file names (case-sensitive)

#### Scanner input not working:
- Make sure to use the correct method (nextInt for int, nextDouble for double)
- Clear buffer with `scanner.nextLine()` after reading numbers before reading strings
- Check for InputMismatchException

#### Code runs but shows unexpected output:
- Check variable scope - ensure variables are accessible where needed
- Verify data types match expected values
- Add print statements to debug variable values
- Review logical operators (&&, ||) usage

## 📚 Additional Resources

### Official Documentation:
- [Java SE Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)
- [Java API Specification](https://docs.oracle.com/en/java/javase/17/docs/api/)

### Recommended Reading:
- "Head First Java" by Kathy Sierra and Bert Bates
- "Effective Java" by Joshua Bloch
- "Java: The Complete Reference" by Herbert Schildt

### Online Learning:
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [JetBrains Academy](https://www.jetbrains.com/academy/)
- [Codecademy Java Course](https://www.codecademy.com/learn/learn-java)

## 🎯 Exam Preparation Checklist

Use this checklist to ensure you're ready:

- [ ] Can explain all three OOP principles with real-world examples
- [ ] Know all 8 primitive data types, their sizes, and ranges
- [ ] Understand variable scope and lifetime
- [ ] Can write if-else and switch-case statements
- [ ] Know when to use if vs switch
- [ ] Can use Scanner class for all data types
- [ ] Can implement bubble sort from memory
- [ ] Understand class structure (member variables, methods)
- [ ] Know difference between public and private
- [ ] Can trace code execution step by step
- [ ] Understand Java is strongly typed and case-sensitive
- [ ] Know valid identifier rules
- [ ] Can explain encapsulation, inheritance, polymorphism

## 📝 Course Information

- **Course:** MCS 7205 - Advanced Computer Programming
- **Instructor:** Dr. A.R. Ajiboye
- **Level:** Master of Computer Science
- **Focus:** Java Fundamentals and Object-Oriented Programming

## 🌟 Future Enhancements

Planned improvements for this repository:

**Learning Materials:**
- [ ] Video tutorials for each topic
- [ ] Interactive quiz system
- [ ] More practice problems with solutions
- [ ] Step-by-step debugging guides

**Code Examples:**
- [ ] Arrays and collections examples
- [ ] File I/O operations
- [ ] Exception handling deep dive
- [ ] Multithreading basics

**Calculator:**
- [ ] Keyboard input support
- [ ] Memory functions (M+, M-, MR, MC)
- [ ] Degree/radian mode toggle
- [ ] Calculation history export
- [ ] Dark mode theme

**Documentation:**
- [ ] Video walkthroughs
- [ ] Interactive code playground
- [ ] Common interview questions
- [ ] Project ideas for practice

## 📄 License

This project is for educational purposes as part of the Master of Computer Science Advanced Programming course (MCS 7205).

## 📧 Contact & Support

For questions, issues, or suggestions:

- **Open an issue** on the GitHub repository
- **Submit a pull request** for improvements
- **Star the repository** if you find it helpful!

---

**Happy Learning! 🚀**

*Remember: Practice makes perfect. Run the examples, modify the code, break things, fix them, and learn!*
