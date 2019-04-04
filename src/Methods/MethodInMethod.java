package Methods;

public class MethodInMethod {

    static void operation(){
        operation("Val", 10, 5.5);                     // 1 Peregruzka (overload)
    }

    static void operation(String text){                                // 2 Peregruzka (overload)
        operation(text, 10, 5.5);
    }

    static void operation(String text, int num){                       // 3 Peregruzka (overload)
        operation(text, num, 5.5);
    }

    static void operation(String text, int num, double drobn){        // 4 Peregruzka (overload)
        System.out.println(text + ", " + num + ", " + drobn);
    }


    public static void main(String[] args) {
        operation();   // Val, 10, 5.5
        operation("Hi");  // Val, 10, 5.5
        operation("Hi", 5);  // Val, 10, 5.5
        operation("Hi", 5, 5.5);  // Val, 10, 5.5
    }
}
