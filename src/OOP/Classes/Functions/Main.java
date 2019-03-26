package OOP.Functions;

public class Main {
    public static void main(String[] args) {

        Box Box1 = new Box();
        Box Box2 = new Box();

        Box1.length = 5;
        Box1.width = 4;
        Box1.height= 10;

        Box2.length = 12;
        Box2.width = 40;
        Box2.height= 3;

        Box1.getVolume();
        Box2.getVolume();

        int volume1 = Box1.volumeReturn();
        int volume2 = Box2.volumeReturn();

        System.out.println(volume1);
        System.out.println(volume2);

    }
}
