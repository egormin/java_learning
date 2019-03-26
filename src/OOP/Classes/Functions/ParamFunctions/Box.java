package OOP.Functions.ParamsFunctions;

public class Box {
    int width;
    int length;
    int height;

    void setDimentions(int height, int width, int length) {
        this.height = height; // this eto znachit chto ispolzuem peremennie lfyyjuj klassa
        this.length = length;
        this.width = width;
    }

    int volumeReturn() {
        return width * height * length;
    }
}
