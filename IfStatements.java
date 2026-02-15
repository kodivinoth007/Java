import java.lang.System;
import java.util.Scanner;

public class IfStatements {
      //If statement method

      /*Actually if statement only execute true or false statement of boolean value
       and if block statement only execute true value.
       else if block statement used for depending on your option statements.
       Eg if you used more statement you can use that else if block.
       else block statement only execute false value.*/

    //Question Check numbers is positive or Negative Using for if statements
        public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int checkNumber = scan.nextInt();

        if(checkNumber > 0){                          //This condition only execute 0 greater than value.
            System.out.println("It's a Positive Number");//Eg, positive number like 0 above number. Eg, input = 2 samelike numbers.
        }else if (checkNumber==0){                    //This condition only execute 0 equal to 0 .
            System.out.println("It's a Zero Not Positive or Not Negative Number"); // Eg input = 0 it will execute code
        }else{                                     //This condition only execute 0 lesser than value.
            System.out.println("It's a Negative Number");// Negative number like o below value number. Eg,input = -3 samelike numbers.
        }
    }

}

