package OOP.Static;

public class Constants {
    //// 1 case
//    private static final float PI = 3.14f;
//
//    {
//        PI = 2.4f;  // Cannot assign final variable
//    }


    //// 2 case
    private static final float PI = 3.14f;  // Here will be error. Should be initialized. Because static methods perform at first rank

    static {
        PI = 2.4f;  // No error
    }
}
