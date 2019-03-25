package Loops;

public class While {
    public static void main(String[] args) {
        int a = 1;
        a--;
        System.out.println(a);

        while (a <= 20){
            System.out.println(a);
            a++;
            if (a == 10){
                break;
            }
        }

        // Vse chiotnie chisla s 1000 do 0

        int sum = 1000;

        while (sum >= 0){
            if (sum % 2 == 0){
                System.out.println(sum);
            }
            sum--;
        }

        //Srednee arifmeticheskoe ot 0 do 100
        int count = 0;
        int start = 0;
        float result;
        while (start <= 100){
            count +=start;
            start++;
        }
        result = count/ (float)start;
        System.out.println("Result = " + result);
    }
}
