package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int [] daysInMonth = new int[12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;

        System.out.println("Days in March: " + daysInMonth[2]);

        for (int i = 0; i < 12; i++){
            System.out.println(daysInMonth[i]);
        }

        for (int i = 0; i < daysInMonth.length; i++){
            System.out.println(daysInMonth[i]);
        }

        int [] newArr  = new int[100];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = i * 10;
        }

        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }

        //For Each
        for(int i: newArr){
            System.out.println(i);
        }

        char [] newChar = new char[10];
        newChar[5] = 'd';
        newChar[2] = 'b';
        newChar[8] = '0';
        for (char i: newChar){
            System.out.println(i);
        }

        /* Create array and initialize it from 100 to 1000;
        Create second array with the length = first array and initialize it from 1000 to 100
        with foreach output all values of second array
         */

        int [] arrayOne = new int[900];
        for (int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = i + 100;
        }


        int [] arrayTwo = new int[arrayOne.length];
        for (int i = 0, j = arrayOne.length -1; i < arrayTwo.length; i++, j--){
            arrayTwo[j] = arrayOne[i];
        }

        for(int i: arrayTwo){
            System.out.println(i);
        }


        // Mnogomernie massivy

        int [][] mnogoAr = new int[2][2];
        mnogoAr[0][0] = 1;
        mnogoAr[0][1] = 2;
        mnogoAr[1][0] = 3;
        mnogoAr[1][1] = 4;
    }
        //Objavlenie massivo i odnovremenno initsializatsiya ego znacheniyami
        int [] newArr = {31,28,30,31};
        for(int i: newArr){
            System.out.println(i);
        }
}
