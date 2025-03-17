package TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            int[] arr = new int[2];
            arr[5] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e.getMessage());
        }
    }
}
