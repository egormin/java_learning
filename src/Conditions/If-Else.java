public class Temp {
    public static void main(String[] args) {
        int temper = 9;

        if (temper > 25) {
            System.out.println("Temperature more than 25");
        } else {
            System.out.println("Temperature less than 25");
        }
        
        // Kratkaya forma zapisi. Tolko odno virazhenie
        if (temper > 25) 
            System.out.println("Temperature more than 25");
        else
            System.out.println("Temperature less than 25");
        
        // Kratkaya forma zapisi. Mozhno i tak
        if (temper > 25) System.out.println("Temperature more than 25");

        if (temper > 25) {
            System.out.println("Temperature more than 25");
        } else if (temper > 10 ){
            System.out.println("Temperature more 10");
        } else {
            System.out.println("Temperature less 10");
        }
    }
}



public class Temp {
    public static void main(String[] args) {
        int money = 400;

        if (money >= 500){
            System.out.println("Buy pizza");
        } else if (money >= 300) {
            System.out.println("Buy shaurma");
        } else if (money >= 100) {
            System.out.println("Buy gamburger");
        }
        else {
            System.out.println("Buy rollton");
        }
    }
}


        String first = "Hello";
        String second = "World";

        // Not correct to compare strings with ==
        if (first == second){
            System.out.println("equals");
        } else {
            System.out.println("Not equals");
        }

        // equals method is correct
        if (first.equals(second)){
            System.out.println("equals");
        } else {
            System.out.println("Not equals");
        }
