package Loops;

public class DorEach {
    public static void main(String[] args) {
        int [] newArr  = new int[100];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = i * 10;
        }

        //For Each
        for(int i: newArr){
            System.out.println(i);
        }
    }
}
