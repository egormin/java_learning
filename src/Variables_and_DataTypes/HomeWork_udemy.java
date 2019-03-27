public class HW_data_types {
    public static void main(String[] args) {
        byte byteOne = 12;  // decimal
        byte byteTwo = 014; // octal
        byte byteThree = 0b1100; // binary
        byte byteFour = 0xC; // heximal

        System.out.println(byteOne);
        System.out.println(byteTwo);
        System.out.println(byteThree);
        System.out.println(byteFour);

//        12
//        12
//        12
//        12

        short shortOne = 300;  // decimal
        short shortTwo = 0454; // octal
        short shortThree = 0b100101100; // binary
        short shortFour = 0x12C; // heximal

        System.out.println(shortOne);
        System.out.println(shortTwo);
        System.out.println(shortThree);
        System.out.println(shortFour);

//        300
//        300
//        300
//        300

        int intOne = 0;  // decimal
        int intTwo = 0; // octal
        int intThree = 0b0; // binary
        int intFour = 0x0; // heximal

        System.out.println(intOne);
        System.out.println(intTwo);
        System.out.println(intThree);
        System.out.println(intFour);

//        0
//        0
//        0
//        0

        long longOne = 123456789L;  // decimal
        long longTwo = 0726746425L; // octal
        long longThree = 0b0111_0101_1011_1100_1101_0001_0101L; // binary
        long longFour = 0x075BCD15; // heximal

        System.out.println(longOne);
        System.out.println(longTwo);
        System.out.println(longThree);
        System.out.println(longFour);

//        123456789
//        123456789
//        123456789
//        123456789

        float myFloat = 0.1f;
        double myDouble = 0.2; //default type, can be used without d
        boolean myBool = true;

        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBool);

        //3 available ways to create char

        char myChar1 = 80;
        char myChar2 = 'A';
        char myChar3 = '\u2348';

        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);

//      P 
//      A
//      ⍈
    }
}
