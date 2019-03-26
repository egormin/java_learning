package Functions.HomeWork;

public class Dog {
    String klichka;
    String poroda;
    int speed;

    void run(){
        for (int i =0; i <= speed; i++){
            if (i < speed){
                System.out.print("begu, ");
            } else {
                System.out.print("begu...");
            }
        }

    }

    String info(){
        return "Klichka: " + klichka + ", poroda: " + poroda + ", skorost: " + speed;
    }
}
