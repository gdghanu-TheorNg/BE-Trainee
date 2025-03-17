package AbtractVsInterface;

abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("Displaying shape...");
    }
}

interface Colorable {
    void setColor(String color);
}

class Circle extends Shape implements Colorable {
    private String color;

    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Color set to: " + color);
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.setColor("Red");
        circle.display();
    }
}