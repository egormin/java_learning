package Methods;

public class Example_Factorial {

    static int factorial(int number) {
        if (number == 0)
            return 1;
        else
            return number * factorial(number - 1);
    }


    public static void main(String[] args) {
        int factorial = factorial(5);

        System.out.println(factorial);  // 120
    }
}
