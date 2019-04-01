import java.util.Scanner;

public class DijkstraLoop {
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
            break;     // Prerivanie
        }
    }
}
