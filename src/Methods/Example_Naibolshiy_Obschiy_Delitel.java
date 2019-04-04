package Methods;

public class Example_Naibolshiy_Obschiy_Delitel {

    // Pervyi variant
    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args) {

        System.out.println("Nahozhdenie naibolshego obschego delitelya dhuh tselyh chisel");

        int a = 676, b = 3676;
        System.out.println("a=" + a + ", b=" + b + ", NOD=" + (calculate(a,b)));   // a=676, b=3676, NOD=4
        System.out.println("a=" + a + ", b=" + b + ", NOD=" + (calculate2(a,b)));   // a=676, b=3676, NOD=4
    }

    // Vtoroy variant (bez rekursii)
    static int calculate2(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a;

    }
}
