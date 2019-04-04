package Methods;

public class Peregruzka_metodov {

    static void method(){
        System.out.println("Hello");
    }

    static void method(String text){
        System.out.println(text);
    }

    static void method(int num){
        System.out.println(num);
    }

    static void method(double num){
        System.out.println(num);
    }

    static void method(int num, String text){
        System.out.println(num + " " + text);
    }

    static void method(String text, int num){
        System.out.println(text + " " + num);
    }

    static void method(String text, String text1){
        System.out.println(text + " " + text1);
    }

    public static void main(String[] args) {

        method();                  // Hello
        method("Hi");         // Hi
        method(100);          // 100
        method(100.0);        // 100.0
        method(5,"you"); // 5 you
        method("you", 5); // you 5
        method("you", "are good"); // you are good
    }
}
