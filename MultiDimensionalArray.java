public class MultiDimensionalArray {
    public static void main(String[] args) {
        // int [][] flats = new int [2][3];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;

        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        // int [] [] flats = { {101,102,103}, 
        //                     {201,202,203} };
        
        // for(int i=0; i< flats.length; i++) {
        //     for(int j=0; j < flats[i].length; j++) {
        //         System.out.printf(" " + flats[i][j]);
        //     }
        //     System.out.println("");
        // }


        float [] marks = {97.4f,93.4f,45.7f,67.3f};
        float num = 45.5f;
        boolean isInArray = false;
        for(float element: marks) {
            if(num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("The value is present in the array");;
        } else {
            System.out.println("The value is not present in the array");
        }
    }
}
