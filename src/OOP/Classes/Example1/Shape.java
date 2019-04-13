package OOP.Classes.Example1;

public class Shape {
    private int length;
    private long height;
    public double square;

    Shape() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int len){
        this.length = len;  // this means for this object
    }
    
    public void viewShape() {
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }

    public long getHeigth(){return height;}

    public void setHeigth(long hei){
        this.height = hei;
    }
}
