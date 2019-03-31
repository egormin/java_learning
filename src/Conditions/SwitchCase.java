public class SwitchCase {
    public static void main(String[] args) {
        int month = 5;
        String result;

        switch (month){
            case 1:
                result ="january";
                break;
            case 2:
                result ="february";
                break;
            case 3:
                result ="march";
                break;
            case 4:
                result ="april";
                break;
            case 5:
                result ="may";
                break;
            case 6:
                result ="june";
                break;
            case 7:
                result ="july";
                break;
            case 8:
                result ="august";
                break;
            case 9:
                result ="september";
                break;
            case 10:
                result ="october";
                break;
            case 11:
                result ="november";
                break;
            case 12:
                result ="december";
                break;
            default: result = "Month not found";
        }
        System.out.println(result);

        //Programma prinimaet strokovuyu peremennuyu s nazvaniem mesiatsa. Esli mesiats pravilnyi, to vivesti vremia goda
        //Ispolzovats els if i switch case

        String mesiats = "june";

        //With If Else
        if(mesiats.equals("january")){
            System.out.println("That is winter");
        } else if(mesiats.equals("february")) {
            System.out.println("That is winter");
        } else if(mesiats.equals("march")) {
            System.out.println("That is spring");
        } else if(mesiats.equals("april")) {
            System.out.println("That is spring");
        } else if(mesiats.equals("may")) {
            System.out.println("That is spring");
        } else if(mesiats.equals("june")) {
            System.out.println("That is summer");
        } else if(mesiats.equals("july")) {
            System.out.println("That is summer");
        } else if(mesiats.equals("august")) {
            System.out.println("That is summer");
        } else if(mesiats.equals("september")) {
            System.out.println("That is autumn");
        } else if(mesiats.equals("october")) {
            System.out.println("That is autumn");
        } else if(mesiats.equals("november")) {
            System.out.println("That is autumn");
        } else if(mesiats.equals("december")){
            System.out.println("That is winter");
        } else {
            System.out.println("Incorrect month");
        }

        //With Switch Case
        switch (mesiats){
            case "january": System.out.println("That is winter"); break;
            case "february": System.out.println("That is winter"); break;
            case "march": System.out.println("That is spring"); break;
            case "april": System.out.println("That is spring"); break;
            case "may": System.out.println("That is spring"); break;
            case "june": System.out.println("That is summer"); break;
            case "july": System.out.println("That is summer"); break;
            case "august": System.out.println("That is summer"); break;
            case "september": System.out.println("That is autumn"); break;
            case "october": System.out.println("That is autumn"); break;
            case "november": System.out.println("That is autumn"); break;
            case "december": System.out.println("That is winter"); break;
            default: System.out.println("Incorrect month"); break;
        }
        
        //-------------------
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter day of week:");

        int day = input.nextInt();

        // Ispolzovanie {} v case ne obiazatelno
        switch (day) {
            case 1: // provalivanie
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a working day");
                break;
            case 6:
            case 7:
                System.out.println("It's a weekend day");
                break;
            default:
                System.out.println("Wrong day number");
                break;
        }

        //-------------------
        // Kofe apparat
        System.out.println("Koffee cups sizes: 1 - small; 2 - middle; 3 - big");
        System.out.println("Please make your choice:");

        Scanner apparatInput = new Scanner(System.in);
        int choice = input.nextInt();

        int cost = 0;

        switch (choice) {
            case 3:
                cost += 50;
            case 2:
                cost += 25;
            case 1:
                cost += 25;
                break;
            default:
                System.out.println("Incorrect choice. please enter again");
        }

        if (cost !=0){
            System.out.println("Please, pay " + cost + " cents");
            System.out.println("Thank you");
        } else {
            System.out.println("Please make your choice");
        }

        System.out.println(choice);
    }

}
