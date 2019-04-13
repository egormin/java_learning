package OOP.Classes.Example2;

public class Car {
    private String model;
    private int maxSpeed;
    private String color;
    private int year;

    public Car() {  // this constructor will be generated by default only if not created any another constructor
    }

    public Car(String model, int maxSpeed, String color, int year) {
        this.model = model;  // Esli ne ukazat this, to vernetsya null pri objavlrnii klassa: new Car("Toyota", 230, "red", 2000);
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.year = year;
    }

    String getModel() { // we can not tu use public modificator because it is the same package
        return model;
    }

    void setModel(String mod) {
        this.model = mod;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int spd) {
        this.maxSpeed = spd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String clr) {
        this.color = clr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yr) {
        this.year = yr;
    }
}
