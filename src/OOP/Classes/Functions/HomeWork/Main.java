package Functions.HomeWork;

/*
Sozdat class Dog v kotoro budet 3 polia: String clichka, String poroda, int skorost.
Sozdat vnutri klassa 2 metoda:
Method run() bez paraetrov tip void. Pri vizove dannogo metoda na ekran vivoditsia stroka 'begu, begu, begu...'. Slovo
begu dolzhno vivestis stolko raz, skilko ukazano v peremennoy skorost
Vtoroy metod String info() vozvraschaet stroku s polnoy informatsiey o sobake (klichka, poroda i skorost). Etot
metod nichego ne vivodit na ekran.
V klasse ain prodeonstrirovat rabotu dannih metodov


 */
public class Main {
    public static void main(String[] args) {

        Dog mydog = new Dog();
        mydog.klichka = "Bobik";
        mydog.poroda = "Ovcharka";
        mydog.speed = 10;

        String dogInfo = mydog.info();
        System.out.println(dogInfo);
        mydog.run();
    }
}
