package Strings;

public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Programming");
        sb.insert(0, "Welcome to ");
        sb.replace(11, 22, "OOP");

        System.out.println(sb.toString());
    }
}
