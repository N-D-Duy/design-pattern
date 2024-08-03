package strategy;

public class Context {
    private CalculateStrategy strategy;

    public Context(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
