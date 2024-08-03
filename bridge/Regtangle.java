package bridge;

public class Regtangle extends Shape {
    public Regtangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing a rectangle ");
        color.applyColor();
    }
    
}
