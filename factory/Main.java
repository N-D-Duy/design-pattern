package factory;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product product = factory.createProduct("A");
        product.use();
        product = factory.createProduct("B");
        product.use();
    }
}
