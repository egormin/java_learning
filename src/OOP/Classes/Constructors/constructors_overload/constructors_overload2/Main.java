package OOP.Constructors.constructors_overload2;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal(10);
        Animal horse = new Animal(28,68);

        System.out.println(" Age: " + cat.getAge() + ", Count: " + cat.getCount()); // Age: 13, Count: 69
        System.out.println(" Age: " + dog.getAge() + ", Count: " + dog.getCount()); // Age: 15, Count: 10
        System.out.println(" Age: " + horse.getAge() + ", Count: " + horse.getCount()); // Age: 28, Count: 68
    }
}
