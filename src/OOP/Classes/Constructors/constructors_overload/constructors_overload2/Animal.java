package OOP.Constructors.constructors_overload2;

public class Animal {
    private int age;
    private int count;

    Animal() {
        this(13, 69); // Will be called constructor:  public Animal(int age, int count)
    }

    public Animal(int age) {
        this(15, age);  //
    }

//    public Animal(int height) {
//        this(15, height);     // We can't use constructor with the same number of parameters
//    }

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
