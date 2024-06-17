public class Calculator {
    protected int firstOperand;
    protected int secondOperand;
    protected char operator;

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    // Constructor to initialize operands and operator
    public Calculator(int firstOperand, int secondOperand, char operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    // Static method to perform calculation
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new ArithmeticException("Cannot divide by zero");
            default:
                throw new UnsupportedOperationException("Unsupported operation");
        }
    }

    // Instance method to perform calculation using instance fields
    public int calculate() {
        return calculate(this.firstOperand, this.secondOperand, this.operator);
    }

    public static void main(String[] args) {
        // Using the instance method
        Calculator calculatorInstance = new Calculator(10, 5, ADDITION);
        System.out.println("Instance Method Result: " + calculatorInstance.calculate());

        // Using the static method
        int staticResult = Calculator.calculate(10, 5, MULTIPLICATION);
        System.out.println("Static Method Result: " + staticResult);
    }
}
