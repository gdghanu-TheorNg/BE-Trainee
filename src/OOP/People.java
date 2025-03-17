package OOP;

//abstract
public abstract class People {
    private String name;

    public People() {

    }

    public People(String name) {
        this.name = name;
    }

    abstract void job();

    void move() {
        System.out.println("People like moving around the city");
    }
}
