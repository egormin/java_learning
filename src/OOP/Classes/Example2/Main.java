package OOP.Classes.Example2;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setModel("Nissan");
        System.out.println(myCar.getModel());

        myCar.setMaxSpeed(250);
        System.out.println(myCar.getMaxSpeed());

        myCar.setColor("Blue");
        System.out.println(myCar.getColor());

        myCar.setYear(2010);
        System.out.println(myCar.getYear());

        //Nissan
        //250
        //Blue
        //2010

        Car newCar = new Car("Toyota", 230, "red", 2000);
        System.out.println(newCar.getModel());
        System.out.println(newCar.getMaxSpeed());
        System.out.println(newCar.getColor());
        System.out.println(newCar.getYear());

        //Toyota
        //230
        //red
        //2000
    }
}
