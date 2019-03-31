import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        // Ternarnyi ilitretichnyi operator

        //-------------------------
        int a = 5, b = 7, c = 0;
        c = (a > b) ? a : b;
        System.out.println(c); //7  Ternarnyi operator vsegda dolzhen vozvrascat znachenie

        //-------------------------
        int d = 5, e = 7, f = -5, max = 0;
        max = (d > e) ? (f = d) : (f = e); // 7
        System.out.println(max);

        //-------------------------
        String string = "Hello ";
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Login:");

        String userLogin = input.next();

        string += (userLogin.equals("Admin")) ? "Administrator" : "User";
        System.out.println(string);

        //-------------------------
        int a1 = 5;
        double b1 = 0.0;
        int max1;

        max1 = (int) ((a1 > b1) ? a1 : b1);
        //or
        //max1 = (a1 > b1) ? a1 : (int)b1;
        System.out.println(max1);  // 5

        //-------------------------
        // Opredelit chetvert
        int x1 = 3, y1 = -2;
        String kvadrant1, kvadrant2, kvadrant3;

        kvadrant1 = (x1 > 0) ? ((y1 > 0) ? "1 kvadrant" : "4 kvadrant") : ((y1 > 0) ? "2 kvadrant" : "3 kvadrant");
        System.out.println(kvadrant1);

        // to zhe samoe
        kvadrant2 = x1 > 0 ? (y1 > 0) ? "1 kvadrant" : "4 kvadrant" : (y1 > 0) ? "2 kvadrant" : "3 kvadrant";
        System.out.println(kvadrant2);

        // to zhe samoe
        kvadrant3 = x1 > 0 ? y1 > 0 ? "1 kvadrant" : "4 kvadrant" : y1 > 0 ? "2 kvadrant" : "3 kvadrant";
        System.out.println(kvadrant3);

        //-------------------------
        // Opredelit skidku
        // Esli pokupaet >= 10 edinits tovara, skidka 25%
        double quantity = 10;
        double price = 100;
        double discount = 0.75;
        double cost;

        cost = (quantity >= 10)? price*discount*quantity:price*quantity;
        System.out.println("Total cost: " + cost);
    }
}
