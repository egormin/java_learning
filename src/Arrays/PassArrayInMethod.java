package Arrays;

public class PassArrayInMethod {

    static int[] arrayMethod(int[] arr, int modifier) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * modifier;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] myArr = new int[]{1,2,3,4,5};

        myArr = arrayMethod(myArr,5);

        for (int i =0; i<myArr.length;i++){
            System.out.print(myArr[i] + " ");  // 5 10 15 20 25
        }
    }
}
