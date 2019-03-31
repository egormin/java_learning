package Loops;

public class DoWhile {
    public static void main(String[] args) {
        int a = 0;

        do {
            System.out.println(a);  //0  vipolnitsia vsegda
        }
        while (a > 0);
    }
      
        // factorial
        int counter = 4;
        int factorial = 1;

        do {
            factorial *= counter--;  // korotkaya forma
//            factorial = factorial + counter;  // dlinnaya forma
//            counter--;
        } while (counter > 0);

        System.out.println(factorial); //24
}
