import java.lang.System;
import java.util.Scanner;

public class Practise{                              //Polymorphism :  Method Overloading - It's allows multiple methods
    public static void main(String [] args){        //with the same name but different parameter in the same class.
        Practise2 obj = new Practise2();
        obj.catty();
        obj.catty(147);
        obj.catty("Catty","Meow");

    }
}



