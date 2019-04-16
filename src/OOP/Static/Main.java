package OOP.Static;

public class Main {
    private int count;

    public static void main(String[] args) {

        Main.doSmth();  // Hello!  Vyzov cherez klass

        doSmth();       // Hello!  Tak kak metod v samom classe, to imz classa mozhno ne ispolzovat

        //System.out.println(count);  // error.  Ne staticheckoe pole ne mozhet byt vyzvano iz staticheskogo metoda, a iz obychnogo mozhet
        // Nado tak:
        Main m = new Main();
        System.out.println(m.count);
    }

    public static void doSmth() {
        System.out.println("Hello!");
    }
    
    public void doSmth1() {
        System.out.println("Hello!");
        System.out.println(count);  // iz obychnogo mozhno
    }
}
