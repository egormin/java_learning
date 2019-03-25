package Loops;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //vivesti chisla ot 1000 do 0 kotorie deliatsia na 3 bez ostatka
        for (int i = 1000; i >= 0; i--){
            if (i % 3 ==0) {
                System.out.println(i);
            }
        }

        //vivesti vse nechiotnie chisla ot 100 do 1000 kotorie deliatsia na 5 bez ostatka
        for (int i = 100; i <= 1000; i++){
            if(i % 2 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
