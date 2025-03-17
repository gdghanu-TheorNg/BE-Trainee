package StaticVsFinal;

class MyClass {
    static int staticInt = 10;
    final int FINALINT = 20;

    static void staticMethod() {
        System.out.println("Static Method " + staticInt);
    }

    final void finalMethod() {
        System.out.println("Final Method " + FINALINT);
    }
}

public class StaticVsFinal {
    public static void main(String[] args) {
        MyClass.staticMethod();
        MyClass myClass = new MyClass();
        myClass.finalMethod();
        // Cannot reassign final variable
        // myClass.FINALINT = 20; // This will cause a compile-time error
    }
}
