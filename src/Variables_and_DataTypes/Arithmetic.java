package Variables_and_DataTypes;

public class Arithmetic {
    public static void main(String[] args) {
        //====================== Арифметические операторы ======================

        // Addition (+)
        byte operand1 = 1, operand2 = 2;  // Множественное объявление
        int sum = operand1 + operand2;
        System.out.println("Sum = " + sum); // Sum = 3

        // Subtraction (-)
        byte operand3 = 5; byte operand4 = 3;  // Можно записывать нескольно команд на одной строке
        int sub = operand3 - operand4;
        System.out.println("Sub = " + sub);  // Sub = 2

        // Multiplication (*)
        byte operand5 = 5, operand6 = 3;
        int mult = operand5 * operand6;
        System.out.println("Mult = " + mult);  // Mult = 15

        // Division (/)
        byte operand7 = 5, operand8 = 2;
        int div = operand7 / operand8;
        System.out.println("Div = " + div);  // Div = 2

        // Reminder after Division (%)
        byte operand9 = 5, operand10 = 2;
        int rem = operand7 % operand8;
        System.out.println("Rem = " + rem);  // Rem = 1

        System.out.println("Rem = " + (5 % 5));  // Rem = 0
        System.out.println("Rem = " + (5 % 15));  // Rem = 5
        System.out.println("Rem = " + (10 % 100));  // Rem = 10


    }
}
