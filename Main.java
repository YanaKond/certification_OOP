public class Main {
    public static void main(String[] args) {
        CalculatorBuilder builder = new CalculatorBuilder();
        double result1 = builder.setOperand1(7)
                                .setOperand2(3)
                                .setOperation("+")
                                .build();
        System.out.println("Результат с помощью CalculatorBuilder: " + result1);

        Operation operation = OperationFactory.createOperation("*");
        if (operation != null) {
            double result2 = operation.calculate(5, 3);
            System.out.println("Результат с помощью OperationFactory: " + result2);
        } else {
            System.out.println("Неизвестная операция");
        }
    }
}