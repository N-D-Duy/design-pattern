package decorator;

public class BlackSugar extends CondimentDecorator {
    public BlackSugar(Beverage beverage) {
        super(beverage);
    }
    
    public double cost() {
        return beverage.cost() + 0.5;
    }
    
    public String description() {
        return beverage.description() + ", Black Sugar";
    }
    
}
