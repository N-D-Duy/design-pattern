package bridge;

public class Main {
    public static void main(String[] args) {
        Shape square = new Regtangle(new RedColor());
        square.draw();
        
        Shape circle = new Circle(new GreenColor());
        circle.draw();
    }
}
