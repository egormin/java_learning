package OOP.Classes;

public class Main {
    public static void main(String[] args) {
        Box mybox; // Obyavliaem peremennuyu tipa Box

        mybox = new Box(); //Sozdaem novyi objekt
        //eto peremennye ssilichnogo tipa

        /* or
        Box mybox = new Box()
         */

        mybox.heigh = 5;
        mybox.width = 10;
        mybox.length = 20;

        double volume = mybox.heigh * mybox.width * mybox.length;

        System.out.println("Total volume: " + volume); //Total volume: 1000.0

        Box Box2 = new Box();
        Box Box3 = new Box();

        Box2.heigh = 5.5;
        Box2.width = 10.9;
        Box2.length = 20.2;

        Box3.heigh = 0.5;
        Box3.width = 10.5;
        Box3.length = 20.7;

        double volume2 = Box2.heigh * Box2.width * Box2.length;
        double volume3 = Box3.heigh * Box3.width * Box3.length;

        System.out.println("" +
                "Value of box1:" + volume +
                "\nValue of box2:" + volume2 +
                "\nValue of box3:" + volume3
        );

        System.out.println(Box3.length);
        Box Box5 = Box3;
        Box5.length = 1000;
        System.out.println("Box5 length:" + Box5.length + ";\nBox3 length:" + Box3.length);
        /*
            20.7
            Box5 length:1000.0;
            Box3 length:1000.0
            znachenie Box3 izmenitsia t.k. Box5 i Box3 vedut na odin i tot zhe objekt
         */

    }
}
