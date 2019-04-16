package OOP.Constructors.constructors_overload;

public class Animal {
    private int age;
    private int count;

    Animal() {
        this.age = 10;
        this.count = 100;
    }

    public Animal(int age) {
        this.age = age;
        this.count = 600;
    }

    public Animal(int age, int count) {
        this.age = age;
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
