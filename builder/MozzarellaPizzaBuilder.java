package builder;

public class MozzarellaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    
    public MozzarellaPizzaBuilder() {
        pizza = new Pizza();
    }
    
    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildCheese() {
        pizza.setCheese("mozarella");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
    
}