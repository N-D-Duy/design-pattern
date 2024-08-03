package builder;

public class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    
    public MargheritaPizzaBuilder() {
        pizza = new Pizza();
    }
    
    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildCheese() {
        pizza.setCheese("mozarella");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("tomato");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
    
}
