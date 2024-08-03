package proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("test_10mb.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
