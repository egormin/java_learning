package OOP.Functions;

public class Box {
    int width;
    int length;
    int height;

    void getVolume(){
        System.out.println(width * height * length);
    }

    int volumeReturn(){
        return width * height * length;
    }
}

