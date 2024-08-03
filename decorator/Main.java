package decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new BlackSugar(beverage);
        System.out.println(beverage.description() + " $" + beverage.cost());
        
        Beverage beverage2 = new BubbleTea();
        beverage2 = new Milk(beverage2);
        beverage2 = new Cream(beverage2);
        System.out.println(beverage2.description() + " $" + beverage2.cost()); 
    }
    
}
