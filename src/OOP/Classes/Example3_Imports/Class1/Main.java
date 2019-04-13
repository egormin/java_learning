package OOP.Classes.Example3_Imports.Class1;

import OOP.Classes.Example3_Imports.Class2.Exampl;

import static java.lang.Math.cos;
import static java.lang.Math.PI;
//import static java.lang.Math.*;  //or such import

public class Main {
    public static void main(String[] args) {

        //To use class from another package we need to import in or to use full path:
        OOP.Classes.Example3_Imports.Class2.Exampl myEx = new OOP.Classes.Example3_Imports.Class2.Exampl();

        // Or import class upper import OOP.Classes.Example3_Imports.Class2.Exampl
        Exampl myEx2 = new Exampl();
        
        
        //// Another example
        double number = 1;
        double result = Math.cos(Math.PI * number);
        System.out.println(result);

        //Or with import
        double number1 = 10;
        double result1 = cos(PI * number);
        System.out.println(result1);

        //-1.0
        //-1.0
    }
}
