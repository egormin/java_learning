package OOP.Functions.ParamsFunctions.HomeWork;

/*
Sozdat class Rect (priamougolnik) v kotoro budet 2 polia: dlina i shirina.
Obyavit 3 metoda:
Perviy prinimaet dlinu i shirinu i ustanavlivaet ih u priamougolnika.
Vtoroy - bez parametrov, vozvraschaet perimatr priamougolnika.
Tretiy - Bez parametrov - vozvraschaet ploschad
Prodemonstrirovat rabotu v main
 */
public class Main {
    public static void main(String[] args) {

        Square mySquare = new Square();
        mySquare.setSize(10, 20);
        int perimetr = mySquare.getPerim();
        int ploschad = mySquare.getSquare();

        System.out.println("Perimetr: " + perimetr);
        System.out.println("Ploschad: " + ploschad);  
    }
}
