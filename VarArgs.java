public class VarArgs {

    static int sum(int x, int ...arr) {
        int result = x;
        for(int element: arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(sum());
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(10, 20, 30));
    }
}