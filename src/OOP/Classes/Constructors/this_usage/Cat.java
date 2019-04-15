package OOP.Constructors.this_usage;

public class Cat {
    String name;
    int age;

//    Cat(String n, int ag){ // Name: Barsik, Age; 5.  It's ok, because names are different
//        name = n;
//        age = ag;
//    }

//    Cat(String name, int age){ // Name: null, Age; 0. When we use the same names, as we should by convention, we face problems
//        name = name;
//        age = age;
//    }

    Cat(String name, int age){ // Name: Barsik, Age; 5. The right way!
        this.name = name;
        this.age = age;
    }
}
