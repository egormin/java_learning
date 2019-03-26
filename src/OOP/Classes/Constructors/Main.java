package OOP.Constructors;

public class Main {
    public static void main(String[] args) {
//        Box myBox = new Box();
//        System.out.println(myBox.getSquare()); //250

        // Peredaem parametri pri initializatsii
        Box myBox = new Box(10,20,30);
        System.out.println(myBox.getSquare());
    }
}
