package Arrays;

public class DvumernyiArray {
    public static void main(String[] args) {

        //// Simple example
        int[][] dvumernArr = new int[3][3];

        dvumernArr[0][0] = 11;
        dvumernArr[0][1] = 12;
        dvumernArr[0][2] = 13;

        dvumernArr[1][0] = 21;
        dvumernArr[1][1] = 22;
        dvumernArr[1][2] = 23;

        dvumernArr[2][0] = 31;
        dvumernArr[2][1] = 32;
        dvumernArr[2][2] = 33;

        System.out.print(dvumernArr[0][0] + " ");
        System.out.print(dvumernArr[0][1] + " ");
        System.out.print(dvumernArr[0][2] + " ");
        System.out.print("\n");
        System.out.print(dvumernArr[1][0] + " ");
        System.out.print(dvumernArr[1][1] + " ");
        System.out.print(dvumernArr[1][2] + " ");
        System.out.print("\n");
        System.out.print(dvumernArr[2][0] + " ");
        System.out.print(dvumernArr[2][1] + " ");
        System.out.print(dvumernArr[2][2] + " ");

        //11 12 13
        //21 22 23
        //31 32 33

        //// 2-dimensions Array filling
        int sizeI = 3;
        int sizeJ = 3;

        int[][] twoArray = new int[sizeI][sizeJ];

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                twoArray[i][j] = i * j + 1;
            }
        }

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }

        //1 1 1
        //1 2 3
        //1 3 5

        // Another way to initialize 2-dimensions array
        int[][] twoArrayAnother = {{1,3,5},{4,22,55},{224,1,4}};
        
        //or
//        int[][] twoArrayAnother = {
//                {1,3,5},
//                {4,22,55},
//                {224,1,4}
//        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoArrayAnother[i][j] + " ");
            }
            System.out.println();
        }
        //1 3 5 
        //4 22 55 
        //224 1 4 

    }
}
