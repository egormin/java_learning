// Slozhnaya rekursiya - kogra iz 1-go metoda vizivaetsya 2-i, a iz 2-go 1-i

package Methods;

public class ComplexRecursion {

    static void recursion(int counter){
        counter--;

        System.out.println("First part of method counter:" + counter);

        if (counter != 0){
            method(counter);
        }

        System.out.println("Second part of method counter:" + counter);
    }

    static void method(int counter){
        counter--;

        System.out.println("First part of method method:" + counter);

        recursion(counter);

        System.out.println("Second part of method method:" + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}

//First part of method counter:2
//First part of method method:1
//First part of method counter:0
//Second part of method counter:0
//Second part of method method:1
//Second part of method counter:2
