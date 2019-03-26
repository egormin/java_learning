public class Floats {
    public static void main(String[] args) {
        float r = 10.8f;
        float pi = 3.14f;
        float square = pi * r * r;

        // With more precise
//        double r = 10.8;
//        double pi = 3.14;
//        double square = pi * r * r;

        System.out.println("Square = " + square);


        //Pifagor theoreme
        double gipotenusa;
        float katetA = 5f;
        float katetB = 14.6f;

        gipotenusa = Math.sqrt((katetA * katetA) + (katetB * katetB));
        System.out.println("Gipotenusa = " + gipotenusa);

    }
}
