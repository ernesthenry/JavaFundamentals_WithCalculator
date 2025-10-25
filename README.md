# Java Fundamentals Project

This project contains Java fundamentals examples. Each folder corresponds to a major section of the tutorial.

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

## Calculator Project

### Details

- **File:** `src/Projects/Calculator.java`
- **Package:** `Projects`

### Features

- Keeps running until the user types `exit`
- Handles invalid input and division by zero

### Running the Calculator

You can run it in VS Code or terminal:

```bash
javac src/Projects/Calculator.java
java -cp src Projects.Calculator
```

## Project Structure

```
java-fundamentals/
├── src/
│   ├── Basics/
│   │   └── HelloWorld.java
│   └── Projects/
│       └── Calculator.java
└── README.md
```

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
- Include a clear description of what your contribution does
