
import java.util.Scanner;
import java.lang.System;

// Today day learn about Types Conversion and Casting,
// I have to learn  basic thing today.

public class AutoConvert {
    public static void main(String[] args) {    // I am mention for float data types of input object,
        //If i have mention of integer value like 3 0r something number.
        // That's output will be print like float data type like decimal number.
        Scanner scan = new Scanner(System.in); //Eg,if you put whole number will be  become decimal number. Eg.3 will become 3.0
        System.out.print("Enter a something you want : "); //It's automatically convert integer value to float type value.
        float one = scan.nextInt();                       //When does thing happen ?
        System.out.print(one);                            // 1. What data types you have mention. it's comparetable each presents of data types.
        // 2. Float data type > integer data type.
    }                                                   // Float data type greater than integer data type , so if you put integer value.
}       //Try it yourself Guys run this program         // It's execute float type of value