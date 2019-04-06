package Arrays;

public class Arrays {
    public static void main(String[] args) {

        //// Example 1. Simple array
        int[] myar = new int[5];

        myar[1] = 5;
        myar[2] = 10;

        for (int i=0; i < myar.length; i++){
            System.out.println(myar[i]);
        }
        //0
        //5
        //10
        //0
        //0
        // other elements were not initialized, so tey were filled by zeros

        // we can use also such variant
        String myarStr[] = new String[]{"One","two","Three"}; 

        for (int i=0; i < myarStr.length; i++){
            System.out.println(myarStr[i]);
        }
        //One
        //two
        //Three
        

        //// Example 2. Simple array with initialization
        int[] myar1 = new int[5];
        for (int i = 0; i < myar1.length; i++){
            myar1[i] = i*2;
        }

        for (int i=0; i < myar1.length; i++){
            System.out.println(myar1[i]);
        }

        //0
        //2
        //4
        //6
        //8

        int[] myar2 = new int[]{1,22,523,6,23};

        // We also can use shorten initialization
        int[] myar2_also = {1,22,523,6,23};
        for (int i=0; i < myar2.length; i++){
            System.out.println(myar2[i]);
        }
        //1
        //22
        //523
        //6
        //23

        for (int i=0; i < myar2_also.length; i++){
            System.out.println(myar2_also[i]);
        }
        //1
        //22
        //523
        //6
        //23

        // Output with ForEach
        for (int elem: myar2){
            System.out.print(elem + " ");  // 1 22 523 6 23
        }
        
        /*
        So we have some variants of arrays initialization
        
        byte[] arr = new byte[5];
        byte arr[] = new byte[5];
        byte[] arr = new byte[]{1,2,454,22,45};
        byte[] arr = {1,2,454,22,45};
        
         */
    }
}
