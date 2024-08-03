package builder;

public interface PizzaBuilder {
    public void buildDough();
    public void buildSauce();
    public void buildCheese();
    public void buildTopping();
    public Pizza getPizza();
}
