import java.util.Scanner;

// Modifitsirovannyi tsikl deykstra s yavnym usloviem vyhoda
public class SpiderLoop {
    public static void main(String[] args) {
        char character;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter symbol: ");
        for (; ; ) {  // beskonechnuy tsikl
            character = inp.next().charAt(0); // Get 0 symbol

            switch (character) {
                case 'l':                         // Ohranyayuschee uslovie 1
                    System.out.println("Go left");   // Ohranyaemaya komanda
                    continue;
                case 'r':                         // Ohranyayuschee uslovie 2
                    System.out.println("Go right");  // Ohranyaemaya komanda
                    continue;
            }

            switch (character) {
                case 'e':                         // Ohranyayuschee uslovie 1
                    System.out.println("Exit");   // Ohranyaemaya komanda
                    break;
                case 'q':                         // Ohranyayuschee uslovie 2
                    System.out.println("Quit");  // Ohranyaemaya komanda
                    break;
                default:
                    System.out.println("Alternative exit");
            }
            break;     // Prerivanie
        }
    }
}
