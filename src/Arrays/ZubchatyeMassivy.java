package Arrays;

// Jagged Arrays
public class ZubchatyeMassivy {
    public static void main(String[] args) {
        int [][] jaggedArr = new int[3][];

        jaggedArr[0] = new int[]{10};
        jaggedArr[1] = new int[]{130,230,330};
        jaggedArr[2] = new int[]{150,250};

        for (int i = 0; i <jaggedArr.length; i++){
            for (int j=0; j<jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }

        //10
        //130 230 330
        //150 250

        // Or another way
        int [][] jaggedArrNew = new int[][]
                {
                        new int[]{10},
                        new int[]{130,230,330},
                        new int[]{150,250}
                };

        for (int i = 0; i <jaggedArrNew.length; i++){
            for (int j=0; j<jaggedArrNew[i].length; j++) {
                System.out.print(jaggedArrNew[i][j] + " ");
            }
            System.out.println();
        }
        
        //10 
        //130 230 330 
        //150 250 

    }
}
