package OOP;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Mammal", "Dog", "Bark", 5, "Bulldog");
        Animal cat = new Cat("Mammal", "Cat", "Meow", 3);
        People student = new Student("John", "John123", "Computer Science");
        System.out.println(dog);
        System.out.println(cat);
        student.job();
        System.out.println(student);
    }
}
