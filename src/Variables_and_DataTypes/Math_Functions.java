package Variables_and_DataTypes;

import static java.lang.Math.pow;

public class Math_Functions {
    public static void main(String[] args) {
        // ==================== Математические функции ====================

        /* Math.pow() - Возведение числа в степень
         * 1-й аргумент - число, которое возводим в степень,
         * 2-й - показатель степени, в которую возводим число
         */

        double x = 2, y = 4;
        double result = pow(x, y);  // Т.к. импортировали import static java.lang.Math.pow, можно писать просто pow
        System.out.println("Res = " + result);  // Res = 16.0

        double result1 = Math.pow(3, 3);  // Так нужно было бы писать, если бы не импортировали
        System.out.println("Res = " + result1);  // Res = 27.0


        // Math.sqrt() - Возведение числа в степень
        double x1 = 256;
        double res1 = Math.sqrt((x1));
        System.out.println("Koren = " + res1);  // Koren = 16.0


    }
}
