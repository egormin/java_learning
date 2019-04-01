//Funktsii - eto metody, kotorie chto-to vozvraschayut
//Protseduri - eto metody, kotorie nichego ne vozvraschayut

// No v java est tolko metody, s vozvraschaemym znacheniem i bez nego

package Methods;

public class Methods {
    static int valueIncrement(int value) {
        value++;
        return value;
    }

    static void rect(int visota) {
        for (int i = 0; i < visota; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static boolean and(boolean a, boolean b) {
        return a && b;
    }

    static String compare(int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        }
        return "a = b";
    }

    static String storozhevoiMethod(String name){

        if (name.equals("fool")){  // Storozhevoi operator
            return "Forbidden word";
        }

        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(valueIncrement(5)); //6

        rect(5);
        rect(3);
        rect(8);

        boolean a = true;
        boolean b = false;
        System.out.println(a + " && " + b + " = " + and(a, b)); // true && false = false

        int one = 5, two = 10;

        System.out.println(compare(one, two)); // a < b

        System.out.println(storozhevoiMethod("fool")); // Forbidden word
        System.out.println(storozhevoiMethod("admin")); // Hello, admin
    }
}
