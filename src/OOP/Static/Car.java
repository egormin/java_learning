package OOP.Static;

public class Car {
    String model;
    String color;

//    int count;

    static int count;

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.count = 5;

        Car.count = 5;

        for (int i = 0; i < 10; i++) {
            Car.count++;
        }
        System.out.println(Car.count);  // 15


    }
}
