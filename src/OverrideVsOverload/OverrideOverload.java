package OverrideVsOverload;

class Parent {
    void display() {
        System.out.println("Displaying parent...");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Displaying child...");
    }

    void display(String message) {
        System.out.println("Displaying child with message: " + message);
    }
}

public class OverrideOverload {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.display("Hello");
    }
}
