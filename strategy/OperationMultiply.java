package strategy;

public class OperationMultiply implements CalculateStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
