package OOP;

public class Animal {

    // encapsulation
    private String type;
    private String name;
    private String sound;
    private int age;

    public Animal() {

    }

    public Animal(String type, String name, String sound, int age) {
        this.type = type;
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [type=" + type + ", name=" + name + ", sound=" + sound + ", age=" + age + "]";
    }

}
