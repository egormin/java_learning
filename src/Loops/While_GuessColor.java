import java.util.Scanner;

public class While_GuessColor {
    public static void main(String[] args) {
        System.out.println("Guess color from 5 attempts");
        System.out.println("Press exit to exit from programm");

        final int ATTEMPTS = 5;
        int attempt = 0;
        String color = "red";

        Scanner inp = new Scanner(System.in);

        while (attempt < ATTEMPTS){
            attempt ++;
            System.out.println("Attempt number " + attempt + ":");
            String choice = inp.next();

            if (choice.equals("exit")){
                break;
            }

            if(!choice.equals(color)){
                continue;
            }

            System.out.println("Cool, you guessed the color. It was " + choice);
            break;
        }

        System.out.println("The end");
    }
}
