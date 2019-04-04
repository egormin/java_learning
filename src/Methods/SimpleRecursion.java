// Prostaya rekursiya - kogda method vizivaet sam sebya

package Methods;

public class SimpleRecursion {

    static void recursion(int counter){
        counter--;

        System.out.println("First part of method: " + counter);

        if (counter !=0){
            recursion(counter);
        }

        System.out.println("Second part of method: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}

//First part of method:2
//First part of method:1
//First part of method:0
//Second part of method:0
//Second part of method:1
//Second part of method:2
