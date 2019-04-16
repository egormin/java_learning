package OOP.Static;

public class Account {
    double UAH;
    String name;
    //double USDtoUAH;     // Bad approach
    static double USDtoUAH;

    public static void main(String[] args) {
        Account.USDtoUAH = 26.1;

        Account a1 = new Account();
        a1.name = "Petr";
        a1.UAH = 5000;
        //a1.USDtoUAH = 26.1;  // Bad approach

        Account a2 = new Account();
        a2.name = "Vasia";
        a2.UAH = 12000;
        //a2.USDtoUAH = 26.1;  // Bad approach

//        System.out.println(a1.name + " have " + a1.UAH/a1.USDtoUAH + " dollars");  //Petr have 191.57088122605364 dollars  // Bad approach
//        System.out.println(a2.name + " have " + a2.UAH/a2.USDtoUAH + " dollars");  //Vasia have 459.7701149425287 dollars  // Bad approach

        System.out.println(a1.name + " have " + a1.UAH / Account.USDtoUAH + " dollars");  //Petr have 191.57088122605364 dollars
        System.out.println(a2.name + " have " + a2.UAH / Account.USDtoUAH + " dollars");  //Vasia have 459.7701149425287 dollars

    }
}
