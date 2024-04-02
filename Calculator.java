public class Calculator {
    private static Calculator instance = new Calculator();

    private Calculator() {
    }

    public static Calculator getInstance() {
        return instance;
    }

    public double calculate(double operand1, double operand2, Operation operation) {
        return operation.calculate(operand1, operand2);
    }
}