package Variables_and_DataTypes;


public class Comparison {
    public static void main(String[] args) {
        // ======================= Сравнение =======================

        byte value1 = 5, value2 = 10;
        boolean result;

        result = value1 < value2;
        System.out.println(value1 + "<" + value2 + ": " + result); // 5<10: true

        result = value1 > value2;
        System.out.println(value1 + ">" + value2 + ": " + result); // 5>10: false

        result = value1 <= value2;
        System.out.println(value1 + "<=" + value2 + ": " + result); // 5<=10: true

        result = value1 >= value2;
        System.out.println(value1 + ">=" + value2 + ": " + result); // 5>=10: false

        result = value1 == value2;
        System.out.println(value1 + "==" + value2 + ": " + result); // 5>=10: false

        result = value1 != value2;
        System.out.println(value1 + "!=" + value2 + ": " + result); // 5!=10: true
    }
}
