package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    // UI Components
    private JTextField displayField;
    private JTextArea historyArea;
    private String currentInput = "";
    private String operator = "";
    private double firstNumber = 0;
    private boolean startNewNumber = false;
    private boolean scientificMode = false;

    public Calculator() {
        setTitle("Scientific Calculator");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(45, 45, 45));

        initializeComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        // Top Panel - Display
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        topPanel.setBackground(new Color(45, 45, 45));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));

        displayField = new JTextField("0");
        displayField.setFont(new Font("Arial", Font.BOLD, 32));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setBackground(new Color(60, 60, 60));
        displayField.setForeground(Color.WHITE);
        displayField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(80, 80, 80), 2),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        topPanel.add(displayField, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        // Center Panel - Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(7, 4, 5, 5));
        buttonPanel.setBackground(new Color(45, 45, 45));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        String[][] buttons = {
            {"sin", "cos", "tan", "√"},
            {"log", "ln", "x^y", "e^x"},
            {"abs", "(", ")", "C"},
            {"7", "8", "9", "÷"},
            {"4", "5", "6", "×"},
            {"1", "2", "3", "-"},
            {"0", ".", "=", "+"}
        };

        for (String[] row : buttons) {
            for (String btnText : row) {
                JButton button = createButton(btnText);
                buttonPanel.add(button);
            }
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Bottom Panel - History
        JPanel bottomPanel = new JPanel(new BorderLayout(5, 5));
        bottomPanel.setBackground(new Color(45, 45, 45));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        JLabel historyLabel = new JLabel("History:");
        historyLabel.setForeground(Color.WHITE);
        historyLabel.setFont(new Font("Arial", Font.BOLD, 14));

        historyArea = new JTextArea(5, 20);
        historyArea.setEditable(false);
        historyArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        historyArea.setBackground(new Color(60, 60, 60));
        historyArea.setForeground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 2));

        bottomPanel.add(historyLabel, BorderLayout.NORTH);
        bottomPanel.add(scrollPane, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 1));
        
        // Color coding
        if (text.matches("[0-9.]")) {
            // Number buttons - dark gray
            button.setBackground(new Color(70, 70, 70));
            button.setForeground(Color.WHITE);
        } else if (text.matches("[+\\-×÷=]")) {
            // Basic operators - orange
            button.setBackground(new Color(255, 149, 0));
            button.setForeground(Color.WHITE);
        } else if (text.equals("C")) {
            // Clear button - red
            button.setBackground(new Color(220, 53, 69));
            button.setForeground(Color.WHITE);
        } else {
            // Scientific functions - blue
            button.setBackground(new Color(52, 152, 219));
            button.setForeground(Color.WHITE);
        }

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            }
            public void mouseExited(MouseEvent e) {
                button.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 1));
            }
        });

        button.addActionListener(e -> handleButtonClick(text));
        
        return button;
    }

    private void handleButtonClick(String text) {
        try {
            switch (text) {
                case "C":
                    clearAll();
                    break;
                case "=":
                    calculateResult();
                    break;
                case "+":
                case "-":
                case "×":
                case "÷":
                case "x^y":
                    handleOperator(text);
                    break;
                case "sin":
                case "cos":
                case "tan":
                case "√":
                case "log":
                case "ln":
                case "e^x":
                case "abs":
                    handleScientificFunction(text);
                    break;
                default:
                    handleNumberInput(text);
                    break;
            }
        } catch (Exception ex) {
            displayField.setText("Error");
            addToHistory("Error: " + ex.getMessage());
        }
    }

    private void handleNumberInput(String text) {
        if (startNewNumber) {
            currentInput = text;
            startNewNumber = false;
        } else {
            if (text.equals(".") && currentInput.contains(".")) {
                return;
            }
            currentInput += text;
        }
        displayField.setText(currentInput);
    }

    private void handleOperator(String op) {
        if (!currentInput.isEmpty()) {
            if (!operator.isEmpty()) {
                calculateResult();
            }
            firstNumber = Double.parseDouble(currentInput);
            operator = op;
            startNewNumber = true;
        }
    }

    private void calculateResult() {
        if (operator.isEmpty() || currentInput.isEmpty()) {
            return;
        }

        double secondNumber = Double.parseDouble(currentInput);
        double result = 0;
        String calculation = firstNumber + " " + operator + " " + secondNumber;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "×":
                result = firstNumber * secondNumber;
                break;
            case "÷":
                if (secondNumber == 0) {
                    displayField.setText("Error: Div by 0");
                    addToHistory(calculation + " = Error (Division by zero)");
                    operator = "";
                    currentInput = "";
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            case "x^y":
                result = Math.pow(firstNumber, secondNumber);
                calculation = firstNumber + "^" + secondNumber;
                break;
        }

        displayField.setText(formatResult(result));
        addToHistory(calculation + " = " + formatResult(result));
        
        currentInput = String.valueOf(result);
        operator = "";
        startNewNumber = true;
    }

    private void handleScientificFunction(String function) {
        if (currentInput.isEmpty()) {
            return;
        }

        double number = Double.parseDouble(currentInput);
        double result = 0;
        String calculation = "";

        switch (function) {
            case "sin":
                result = Math.sin(Math.toRadians(number));
                calculation = "sin(" + number + "°)";
                break;
            case "cos":
                result = Math.cos(Math.toRadians(number));
                calculation = "cos(" + number + "°)";
                break;
            case "tan":
                result = Math.tan(Math.toRadians(number));
                calculation = "tan(" + number + "°)";
                break;
            case "√":
                if (number < 0) {
                    displayField.setText("Error: Negative");
                    addToHistory("√" + number + " = Error (Negative number)");
                    return;
                }
                result = Math.sqrt(number);
                calculation = "√" + number;
                break;
            case "log":
                if (number <= 0) {
                    displayField.setText("Error: Non-positive");
                    addToHistory("log(" + number + ") = Error (Non-positive)");
                    return;
                }
                result = Math.log10(number);
                calculation = "log₁₀(" + number + ")";
                break;
            case "ln":
                if (number <= 0) {
                    displayField.setText("Error: Non-positive");
                    addToHistory("ln(" + number + ") = Error (Non-positive)");
                    return;
                }
                result = Math.log(number);
                calculation = "ln(" + number + ")";
                break;
            case "e^x":
                result = Math.exp(number);
                calculation = "e^" + number;
                break;
            case "abs":
                result = Math.abs(number);
                calculation = "|" + number + "|";
                break;
        }

        displayField.setText(formatResult(result));
        addToHistory(calculation + " = " + formatResult(result));
        
        currentInput = String.valueOf(result);
        startNewNumber = true;
    }

    private void clearAll() {
        currentInput = "";
        operator = "";
        firstNumber = 0;
        startNewNumber = false;
        displayField.setText("0");
    }

    private String formatResult(double result) {
        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%.8f", result).replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }

    private void addToHistory(String entry) {
        historyArea.append(entry + "\n");
        historyArea.setCaretPosition(historyArea.getDocument().getLength());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Calculator();
        });
    }
}
