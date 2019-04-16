package OOP.Constructors.constructors_overload;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal(5);
        Animal horse = new Animal(22,66);

        System.out.println("Age: " + cat.getAge() + ", Count: " + cat.getCount()); // Age: 10, Count: 100
        System.out.println("Age: " + dog.getAge() + ", Count: " + dog.getCount()); // Age: 5, Count: 600
        System.out.println("Age: " + horse.getAge() + ", Count: " + horse.getCount()); // Age: 22, Count: 66
    }
}
