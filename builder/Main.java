package builder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder margheritaPizzaBuilder = new MargheritaPizzaBuilder();
        PizzaDirector margheritaPizzaDirector = new PizzaDirector(margheritaPizzaBuilder);
        margheritaPizzaDirector.makePizza();
        Pizza margheritaPizza = margheritaPizzaDirector.getPizza();
        System.out.println(margheritaPizza);

        
        PizzaBuilder mozzarellaPizzaBuilder = new MozzarellaPizzaBuilder();
        PizzaDirector mozzarellaPizzaDirector = new PizzaDirector(mozzarellaPizzaBuilder);
        mozzarellaPizzaDirector.makePizza();
        Pizza mozzarellaPizza = mozzarellaPizzaDirector.getPizza();
        System.out.println(mozzarellaPizza);
    }
}
