package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Scientific Command-Line Calculator ===");
        System.out.println("Basic operations: +, -, *, /");
        System.out.println("Scientific functions: sin, cos, tan, sqrt, log, ln, pow, exp");
        System.out.println("Single-value operations: abs, factorial");

        while (true) {
            System.out.print("\nEnter operation type (basic/scientific) or 'exit' to quit: ");
            String operationType = scanner.nextLine().trim().toLowerCase();

            if (operationType.equals("exit")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            if (operationType.equals("basic")) {
                performBasicOperation(scanner);
            } else if (operationType.equals("scientific")) {
                performScientificOperation(scanner);
            } else {
                System.out.println("Invalid operation type. Please choose 'basic' or 'scientific'.");
            }
        }

        scanner.close();
    }

    private static void performBasicOperation(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1;
        try {
            num1 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.nextLine().charAt(0);

        System.out.print("Enter second number: ");
        double num2;
        try {
            num2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);
    }

    private static void performScientificOperation(Scanner scanner) {
        System.out.print("Enter function (sin, cos, tan, sqrt, log, ln, pow, exp, abs, factorial): ");
        String function = scanner.nextLine().trim().toLowerCase();

        double result;

        switch (function) {
            case "sin":
                System.out.print("Enter angle in degrees: ");
                double angleSin = getNumberInput(scanner);
                if (Double.isNaN(angleSin)) return;
                result = Math.sin(Math.toRadians(angleSin));
                System.out.println("sin(" + angleSin + "°) = " + result);
                break;

            case "cos":
                System.out.print("Enter angle in degrees: ");
                double angleCos = getNumberInput(scanner);
                if (Double.isNaN(angleCos)) return;
                result = Math.cos(Math.toRadians(angleCos));
                System.out.println("cos(" + angleCos + "°) = " + result);
                break;

            case "tan":
                System.out.print("Enter angle in degrees: ");
                double angleTan = getNumberInput(scanner);
                if (Double.isNaN(angleTan)) return;
                result = Math.tan(Math.toRadians(angleTan));
                System.out.println("tan(" + angleTan + "°) = " + result);
                break;

            case "sqrt":
                System.out.print("Enter number: ");
                double num = getNumberInput(scanner);
                if (Double.isNaN(num)) return;
                if (num < 0) {
                    System.out.println("Error: Cannot calculate square root of negative number.");
                    return;
                }
                result = Math.sqrt(num);
                System.out.println("√" + num + " = " + result);
                break;

            case "log":
                System.out.print("Enter number (log base 10): ");
                double numLog = getNumberInput(scanner);
                if (Double.isNaN(numLog)) return;
                if (numLog <= 0) {
                    System.out.println("Error: Logarithm undefined for non-positive numbers.");
                    return;
                }
                result = Math.log10(numLog);
                System.out.println("log₁₀(" + numLog + ") = " + result);
                break;

            case "ln":
                System.out.print("Enter number (natural log): ");
                double numLn = getNumberInput(scanner);
                if (Double.isNaN(numLn)) return;
                if (numLn <= 0) {
                    System.out.println("Error: Natural logarithm undefined for non-positive numbers.");
                    return;
                }
                result = Math.log(numLn);
                System.out.println("ln(" + numLn + ") = " + result);
                break;

            case "pow":
                System.out.print("Enter base: ");
                double base = getNumberInput(scanner);
                if (Double.isNaN(base)) return;
                System.out.print("Enter exponent: ");
                double exponent = getNumberInput(scanner);
                if (Double.isNaN(exponent)) return;
                result = Math.pow(base, exponent);
                System.out.println(base + "^" + exponent + " = " + result);
                break;

            case "exp":
                System.out.print("Enter exponent (e^x): ");
                double exp = getNumberInput(scanner);
                if (Double.isNaN(exp)) return;
                result = Math.exp(exp);
                System.out.println("e^" + exp + " = " + result);
                break;

            case "abs":
                System.out.print("Enter number: ");
                double numAbs = getNumberInput(scanner);
                if (Double.isNaN(numAbs)) return;
                result = Math.abs(numAbs);
                System.out.println("|" + numAbs + "| = " + result);
                break;

            case "factorial":
                System.out.print("Enter non-negative integer: ");
                int numFact = (int) getNumberInput(scanner);
                if (numFact < 0) {
                    System.out.println("Error: Factorial is only defined for non-negative integers.");
                    return;
                }
                if (numFact > 20) {
                    System.out.println("Error: Factorial too large (max 20).");
                    return;
                }
                long factResult = factorial(numFact);
                System.out.println(numFact + "! = " + factResult);
                break;

            default:
                System.out.println("Invalid function. Please choose from the available functions.");
        }
    }

    private static double getNumberInput(Scanner scanner) {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return Double.NaN;
        }
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
