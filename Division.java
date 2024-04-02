public class Division implements Operation {
    @Override
    public double calculate(double operand1, double operand2) {
        if (operand2 == 0) {
            System.out.println("Деление на ноль");
            return 0.0;
        }
        return operand1 / operand2;
    }
}