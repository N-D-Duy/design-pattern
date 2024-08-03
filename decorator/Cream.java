package decorator;

public class Cream extends CondimentDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }
    
    public double cost() {
        return beverage.cost() + 0.15;
    }
    
    public String description() {
        return beverage.description() + ", Cream";
    }
    
}
