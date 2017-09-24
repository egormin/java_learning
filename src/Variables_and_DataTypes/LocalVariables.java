package Variables_and_DataTypes;

public class LocalVariables {
    public static void main(String[] args) {

        {
            int a = 10;
        }

        //System.out.println(a); // ОШИБКА: Переменная объявлена в локальной области и не существует за её пределами

        {
            int a = 100;
            System.out.println(a); // 100
        }

        int a = 500;               // Это тоже локальная переменная
        System.out.println(a);     // 500
    }
}
