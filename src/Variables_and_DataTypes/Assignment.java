package Variables_and_DataTypes;

public class Assignment {
    public static void main(String[] args) {
        // Присвоение со сложением для типа byte

        byte variable1 = 0;

        //variable1 = variable1 + 5; // ОШИБКА: Попытка неявного преобразования значения результата типа int в тип byte
        //variable1 = (byte)variable1 + 5; // ОШИБКА: Происходит преобразование типа byte в тип byte раньше выполнения операции сложения


        // Варианты решения
        variable1 = (byte)(variable1 + 5); // Громоздкое решение
        System.out.println(variable1);
        variable1 +=5;                     // Элегантное решение
        variable1 +=5000;                  // Сужение типа


        // Для типов int и long не происходит преобразование в int
        // Присвоение со сложением
        int variabl2 = 0;
        variabl2 = variabl2 + 5; // Нет ошибки
        variabl2 +=5;

        // Присвоение с вычитанием
        int variable3 = 0;
        variable3 = variable3 - 5; // Нет ошибки
        variable3 -=5;

        // Присвоение с умножением
        int variable4 = 0;
        variable3 = variable3 * 5; // Нет ошибки
        variable3 *=5;

        // Присвоение с делением
        int variable5 = 0;
        variable3 = variable3 / 5; // Нет ошибки
        variable3 /=5;

        // Присвоение остатка от деления
        int variable6 = 0;
        variable3 = variable3 % 5; // Нет ошибки
        variable3 %=5;


        // Для типов float и double не происходит преобразование в int
        float variable7 = 0;
        variable7 = variable7 + 5; // Нет ошибки
        variable7 +=5;

        // Для типов float и double не происходит преобразование в int
        double variable8 = 0;
        variable8 = variable8 * 5; // Нет ошибки
        variable8 *=5;



    }
}
