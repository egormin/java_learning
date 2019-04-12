package OOP.Incapsulation.package1;

import OOP.Incapsulation.package2.*;

public class Main {
    public static void main(String[] args) {
        ExampleInPackage1 e1 = new ExampleInPackage1();

        //System.out.println(e1.name1);  // private  //not available out of class
        System.out.println(e1.name2);    // package
        System.out.println(e1.name3);    // protected
        System.out.println(e1.name4);    // public

        //package
        //protected
        //public
        
        // To use class from other package it should be imported
        //import OOP.Incapsulation.package2.ExampleInPackage2;   
        ExampleInPackage2 e2 = new ExampleInPackage2();

        //System.out.println(e1.name1);    // not available
        //System.out.println(e2.name2);    // not available
        //System.out.println(e2.name3);    // not available
        System.out.println(e2.name4);
        
        Parent p = new Parent();

        //System.out.println(p.name1);    // not available
        //System.out.println(p.name2);    // not available
        //System.out.println(p.name3);    // not available
        System.out.println(p.name4);

    }
}
