package proxy;

public class ImageProxy implements Image {
    private String fileName;
    private Image image;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.display();
    }
    
}
