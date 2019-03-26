package OOP.Functions.ParamsFunctions;

public class Main {
    public static void main(String[] args) {
        Square mySquare = new Square();
        System.out.println(mySquare.getSquare(5));

        Box myBox = new Box();
        myBox.setDimentions(10, 15, 22);
        System.out.println(myBox.volumeReturn());
    }
}
