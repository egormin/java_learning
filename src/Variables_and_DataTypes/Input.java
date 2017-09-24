package Variables_and_DataTypes;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // ======================= Ввод данных =======================

        // Объект класса Scanner позволяет обрабатывать ввод данных с консоли
        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int a = input.nextInt(); // Считываем целое число
        System.out.println("Вы ввели " + a);   // Вы ввели 1

        System.out.println("Введите дробное число:");
        float b = input.nextFloat(); // Считываем дробное число
        System.out.println("Вы ввели " + b);   // Вы ввели 2.7

        System.out.println("Введите строку с пробелами");
        String c = input.next();  // Считываем строку до первого пробела
        System.out.println("Вы ввели " + c);  // Вы ввели привет

        input = new Scanner(System.in);
        System.out.println("Введите целую строку");
        String d = input.nextLine(); // Считываем целую строку

        System.out.println("Вы ввели " + d); // привет, мир
    }
}
