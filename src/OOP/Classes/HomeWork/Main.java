/* Sozdat klass chelovek, v kotorom budet 3 polya: imya, vozrast i ves
V klasse Main sozdat 5 ekzempliarov klassa chelovek, prisvoit znacheniya ih polyam i vivesti na ekran ih srednii vozrast
 */

package OOP.Classes.HomeWork;

public class Main {
    public static void main(String[] args) {

        Human Human1 = new Human();
        Human1.name = "Ivan";
        Human1.age = 30;
        Human1.weight = 70;

        Human Human2 = new Human();
        Human2.name = "Max";
        Human2.age = 37;
        Human2.weight = 85;

        Human Human3 = new Human();
        Human3.name = "Masha";
        Human3.age = 22;
        Human3.weight = 55;

        Human Human4 = new Human();
        Human4.name = "Olga";
        Human4.age = 44;
        Human4.weight = 80;

        Human Human5 = new Human();
        Human5.name = "Kolya";
        Human5.age = 60;
        Human5.weight = 100;

        System.out.println("Sredniy vozrast = " + (Human1.age + Human2.age + Human3.age + Human4.age + Human5.age)/5);
        // Sredniy vozrast = 38

        //Ili mozhno sdelat tak
        Human [] men = new Human[5];
        men[0] = Human1;
        men[1] = Human2;
        men[2] = Human3;
        men[3] = Human4;
        men[4] = Human5;

        int sum = 0;

        for (int i = 0; i < men.length; i++){
            sum += men[i].age;
        }
        System.out.println("Sredniy vozrast = " + sum / men.length);
    }
}
