package OOP.Classes.Example1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.square = 24.0;
        System.out.println(shape.square);

        shape.setLength(20);
        System.out.println(shape.getLength());

        shape.setHeigth(50);
        System.out.println(shape.getHeigth());

        shape.viewShape();

        //24.0
        //20
        //50
        //Length: 20
        //Height: 50
    }
}
