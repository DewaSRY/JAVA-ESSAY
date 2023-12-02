package Designpattern.Structural.Proxy;

public class ImagesData {
    public static void main(String[] args) {
        Image i = new RealImage("myPic.png");
        i.display();
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Check for the instance existence
        // Object is not created yet
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        // Object is created already
        realImage.display();
    }
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;

        this.loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display the " + this.fileName);
    }

    void loadFromDisk(String fileName) {
        System.out.println("Loading from " + fileName);
    }

}

interface Image {
    void display();
}