public class ConvertString {
    public static void main(String[] args) {
        String str = "Hello World!";
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + upper);
        System.out.println("Lowercase String: " + lower);
        System.out.println("Reversed String: " + reverse);
    }
}
