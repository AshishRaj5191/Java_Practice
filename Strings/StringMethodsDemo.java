package Strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "   Java Programming    ";
        System.out.println("Length: " + str.length());
        System.out.println("Char at 2: " + str.charAt(2));
        System.out.println("substring(5, 16): " + str.substring(5, 16));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Trim: " + str.trim() + "'");
    }
}
//WAP to accept a sentence from the user and remove all the spaces from the extrem left and right and also ensure to keep only ine space in the ssentence
