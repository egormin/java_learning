package OOP.Constructors.HomeWork;

public class Rabotnik {
    String name;
    String job;
    int salary;

    Rabotnik(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    String getInfo(int i) {
        return "Employee " + name + ", job " + job + ", for the last " + i + " months received " + salary * i + ".";
    }
}
