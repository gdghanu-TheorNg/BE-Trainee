package OOP;

//inheritance
public class Dog extends Animal {

    private String breed;

    public Dog() {

    }

    public Dog(String type, String name, String sound, int age, String breed) {
        super(type, name, sound, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", " + super.toString() + "]";
    }
}
