package OOP;

public class Cat extends Animal implements AnimalAction {

    public Cat() {

    }

    public Cat(String type, String name, String sound, int age) {
        super(type, name, sound, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat like eating fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat like sleeping in the afternoon");
    }

    @Override
    public void move() {
        System.out.println("Cat like moving around the house");
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }

}
