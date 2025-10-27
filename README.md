# Java Fundamentals Project

This project contains Java fundamentals examples. Each folder corresponds to a major section of the tutorial.

This is a project for the Master of Computer Science Advanced Programming course unit.

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

## Running Examples

You can run examples in VS Code or the terminal using:

```bash
javac src/Basics/HelloWorld.java
java -cp src Basics.HelloWorld
```

## Calculator Project - GUI Version

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

## Project Structure

```
java-fundamentals/
├── src/
│   ├── Basics/
│   │   └── HelloWorld.java
│   └── Projects/
│       └── Calculator.java (GUI Version)
└── README.md
```

## Technical Details

### GUI Components Used:
- **JFrame:** Main window container
- **JTextField:** Display field for showing numbers and results
- **JButton:** Interactive buttons for all operations
- **JTextArea:** History log with scrolling
- **GridLayout & BorderLayout:** Layout managers for organizing components

### Key Programming Concepts:
- **Event-Driven Programming:** Button click handlers
- **Swing GUI Framework:** Modern Java UI components
- **Object-Oriented Design:** Encapsulation and method organization
- **Exception Handling:** Try-catch blocks for robust error management
- **Mathematical Operations:** Java Math library integration

## Contributing

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
- Follow Java naming conventions
- Test your code before submitting
- For GUI changes, ensure cross-platform compatibility
- Include screenshots for visual changes
- Include a clear description of what your contribution does

## Troubleshooting

### Calculator window doesn't appear:
- Make sure you have Java JDK installed (not just JRE)
- Verify your JAVA_HOME environment variable is set correctly
- Try running with: `java -version` to confirm Java is installed

### Compilation errors:
- Ensure you're in the correct directory
- Check that the package structure matches the file location
- Make sure all files are saved before compiling

## Future Enhancements

Possible improvements for contributors:
- Add keyboard input support
- Add memory functions (M+, M-, MR, MC)
- Add more scientific functions (sinh, cosh, tanh)
- Add calculation history export
- Add themes/dark mode toggle
- Add degree/radian mode toggle

## License

This project is for educational purposes as part of the Master of Computer Science Advanced Programming course.

## Contact

For questions or issues, please open an issue on the GitHub repository.
