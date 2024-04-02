class CalculatorBuilder {
    private double operand1;
    private double operand2;
    private String operation;

    public CalculatorBuilder setOperand1(double operand1) {
        this.operand1 = operand1;
        return this;
    }

    public CalculatorBuilder setOperand2(double operand2) {
        this.operand2 = operand2;
        return this;
    }

    public CalculatorBuilder setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public double build() {
        Operation op = OperationFactory.createOperation(operation);
        return Calculator.getInstance().calculate(operand1, operand2, op);
    }
}