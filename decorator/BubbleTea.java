package decorator;

public class BubbleTea implements Beverage {
    public double cost() {
        return 3.99;
    }

    public String description() {
        return "Bubble Tea";
    }
    
}
