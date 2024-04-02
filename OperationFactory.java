class OperationFactory {
    public static Operation createOperation(String operation) {
        if (operation.equals("+")) {
            return new Addition();
        } else if (operation.equals("*")) {
            return new Multiplication();
        } else if (operation.equals("/")) {
            return new Division();
        } else {
            return null;
        }
    }
}