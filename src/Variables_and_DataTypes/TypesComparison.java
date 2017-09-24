package Variables_and_DataTypes;

public class TypesComparison {
    public static void main(String[] args) {
        // ================== Сравнение типов данных ==================

        boolean result1;
        boolean result2;
        boolean result3;

        int a =1;
        float b = 2.0f;
        result1 = a == b; // Значение типа int со значением типа float допустимо

        String c = "Hello";
        String d = "Hello";
        System.out.println(c + 1); // Hello1 Можно и так

        //result2 = c < a;  //ОШИБКА: Значение типа int со значением типа string недопустимо
        // == - сравнивавет по ссылке, equals - сравнивает по значению
        result2 = c.equals(a); // Объекты лучше сравнивать через equals

        System.out.println(result1); // false
        System.out.println(result2); // false
        System.out.println(c == d);  // true


        char u = 0x0001;
        result3 = a < u;
        System.out.println(u); // 
        System.out.println(result3); // false
        result3 = a <= u;
        System.out.println(result3); // true



    }
}
