package decorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    
    public double cost() {
        return beverage.cost() + 0.10;
    }
    
    public String description() {
        return beverage.description() + ", Milk";
    }
    
}
