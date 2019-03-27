package OOP.Classes;

import OOP.Classes.HomeWork.Test3;

public class Test2 {
    int b = 10;
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        //System.out.println(b); //error
        Test2 newTest = new Test2();
        System.out.println(newTest.b);
    }
}
