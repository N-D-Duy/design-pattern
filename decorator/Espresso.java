package decorator;

public class Espresso implements Beverage {
    public double cost() {
        return 1.99;
    }

    public String description() {
        return "Espresso";
    }
    
}
