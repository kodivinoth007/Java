import java.util.Scanner;
import java.lang.System;

//TypeCasting Method
/*How to convert datatype like integer to float.
 TypeCasting,casting incomparetible types
 Sometimes called narrowing conversions.*/

public class TypeCasting{
    public static void main(String [] args){
                                              //Try it yourself Guys short data type using for TypeCasting Method
        //Convert to byte data types
        byte num1 = (byte) (257);     //That integer data convert or typecast for byte datatype. output = 1
        byte num2 = (byte) (757358785l); //That integer or long data convert or typecast for byte datatype. output = -63
        byte num3 = (byte)(4.56f); //That float data convert or typecast for byte datatype. output = 4
        byte num4 = (byte)(6434.5545d);  //That Double data convert or typecast for byte datatype. output = 34
        //Convert to integer data types
        int num5 = (int) (200);     //That integer data convert or typecast for byte datatype. output = 200
        int num6 = (int) (757358785l); //That integer or long data convert or typecast for integer datatype. output = 757358785
        int num7 = (int)(4.56f); //That float data convert or typecast for integer datatype. output = 4
        int num8 = (int)(6434.5545d);  //That Double data convert or typecast for byte datatype. output = 6434
        //Convert to long data types
        long num9 = (long) (220);     //That byte data convert or typecast for long datatype. output = 220
        long num10 = (long) (7573); //That integer  data convert or typecast for long datatype. output = 7573
        long num11 = (long)(4.56f); //That float data convert or typecast for long datatype. output = 4
        long num12 = (long)(6434.5545d);  //That Double data convert or typecast for long datatype. output = 6434
        //Convert to float data types
        float num13 = (float) (227);     //That byte data convert or typecast for float datatype. output = 227.0
        float num14 = (float) (7556); //That integer  data convert or typecast for float datatype. output = 7556.0
        float num15 = (float)(322334344l); //That long data convert or typecast for float datatype. output = 3.2233434E8
        float num16 = (float)(6434.5545d);  //That Double data convert or typecast for float datatype. output = 6434.5547
        //Convert to double data types
        double num17 = (double) (237);     //That byte data convert or typecast for double datatype. output = 237.0
        double num18 = (double) (7573); //That integer data convert or typecast for double datatype. output = 7573.0
        double num19 = (double)(453535545l); //That long data convert or typecast for double datatype. output = 4.53535545E8
        double num20 = (double)(6.34f);  //That float data convert or typecast for double datatype. output = 6.340000152587891


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println();
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println();
        System.out.println(num9);
        System.out.println(num10);
        System.out.println(num11);
        System.out.println(num12);
        System.out.println();
        System.out.println(num13);
        System.out.println(num14);
        System.out.println(num15);
        System.out.println(num16);
        System.out.println();
        System.out.println(num17);
        System.out.println(num18);
        System.out.println(num19);
        System.out.println(num20);
    }
}