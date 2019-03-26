package OOP.Constructors;

public class Box {
    int width;
    int length;
    int height;

    // Konstruktor bez parametrov
    // On vsegda sozdaetsia avtomaticheski so znacheniyami po uolchaniyu. No tak kak mi sozdali tut svoi, to java vizovet ego
//    Box() {
//        width = 10;
//        length = 5;
//        height = 5;
//    }

    // Konstruktor s parametrami alt + insert
    Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    int getSquare() {
        return height * width * length;
    }
}
