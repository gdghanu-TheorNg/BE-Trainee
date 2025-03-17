package Passing;

public class PassParameter {
    public static int modify(int x) {
        x = 10;
        return x;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before modify method: " + x);
        x = modify(x);
        System.out.println("After modify method: " + x);
    }
}
