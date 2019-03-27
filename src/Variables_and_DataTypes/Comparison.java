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
       
        //Short circuit operation
        int c = 5;
        bool myBool = (2>3) && ++c==6; //tak kak pervaya chast false vtoraya dazhe ne budet schitatsya i c ostanetsya ravnym 5
        System.out.println(c); //5
        
        //Bitwise operators | &
        int c = 5;
        bool myBool = (2>3) && ++c==6; // Pri ispolzovanoo bitwise operatorov, vtoraya chast virazheniya budet vsegda vipolniatsya
        System.out.println(c); //6
    }
}
