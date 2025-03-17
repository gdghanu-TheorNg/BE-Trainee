package String;

public class StringHandling {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String concatenation: " + str1 + " " + str2);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);

        // String pool
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("String pool check (s1 == s2): " + (s1 == s2)); // True due to string pool
    }
}
