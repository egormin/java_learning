package Variables_and_DataTypes;

public class ImcrementDecrement {
    public static void main(String[] args) {
        // ======================= Операторы инкремента и декремента =======================
        // Increment and decrement operators

        byte number1 = 0; // Post-increment.
        System.out.println("---- Постфиксный инкремент: " + number1++); // Сначала выводим на экран, потом увеличиваем на 1
        // ---- Постфиксный инкремент: 0
        System.out.println("---- Постфиксный инкремент: " + number1);
        // ---- Постфиксный инкремент: 1


        byte number2 = 0; // Pre-increment.
        System.out.println("---- Префиксный инкремент: " + ++number2); // Сначала увеличиваем на 1, потом выводим на экран
        // ---- Префиксный инкремент: 1


        byte number3 = 0; // Post-decrement
        System.out.println("---- Постфиксный декремент: " + number3--); // Сначала выводим на экран, потом уменьшаем на 1
        // ---- Постфиксный декремент: 0
        System.out.println("---- Постфиксный декремент: " + number3);
        // ---- Постфиксный декремент: -1

        byte number4 = 0; // Pre-decrement
        System.out.println("---- Префиксный декремент: " + --number4);
        // ---- Префиксный декремент: -1

        // Сокращенные формы записи
        int i =0;
        i = i+1; i+=1;
        i = i+50; i+=50;
        i = i-20; i-=29;

        // Примеры
        byte a =5, b = 3;
        byte c = (byte)(a++ + ++b);
        System.out.println(c + " " + a + " " + b);  // 9 6 4


        int a1 = 6,  b1 = 4;
        a1 = ++a1 + b1++ + a1++;
        int c1 = --a1 + b1--;
        System.out.println();
        System.out.println(a1 + " " + b1 + " " + c1);  // 17 4 22




    }
}
