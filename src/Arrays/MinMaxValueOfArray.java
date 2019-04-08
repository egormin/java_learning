package Arrays;

public class MinimalValueOfArray {
    public static void main(String[] args) {

        // Find Min value of array
        int[] arr = {1, 5, -3, 40, -22, 50};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal value is: " + min);  // Minimal value is: -22

        // Find Max value of array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximal value is: " + max);  // Maximal value is: 50


        // Generate array with random. Find min, max and replace the with each other

        int myArr[] = new int[5];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 10 - 5);  // from -5 to 10
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");  // Source array
        }

        int myArrMin = myArr[0];
        int myArrMax = myArr[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < myArrMin) {
                myArrMin = myArr[i];
                minIndex = i;
            } else if (myArr[i] > myArrMax) {
                myArrMax = myArr[i];
                maxIndex = i;
            }
        }

        System.out.println("\nMinimal element is: " + myArrMin);
        System.out.println("Maximal element is: " + myArrMax);

        System.out.println("\nMinimal index is: " + minIndex);
        System.out.println("Maximal element is: " + maxIndex);

        for (int i = 0; i < myArr.length; i++) {
            if (i == minIndex) myArr[i] = myArrMax;
            else if (i == maxIndex) myArr[i] = myArrMin;
        }

        for (int val: myArr){
            System.out.print(val + " ");
        }

        //-1 -1 0 -2 -4
        //Minimal element is: -4
        //Maximal element is: 0
        //
        //Minimal index is: 4
        //Maximal element is: 2
        //-1 -1 -4 -2 0 
    }
}
